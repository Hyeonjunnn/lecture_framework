package com.beyond.university.auth.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.auth.jwt
 * <p>fileName       : JwtTokenProvider
 * <p>author         : hjsong
 * <p>date           : 2025-02-25
 * <p>description    :
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-25        hjsong             최초 생성
 */

@Slf4j
@Component
public class JwtTokenProvider {

    private final SecretKey secretKey;

    private final UserDetailsService userDetailsService;

    private static final long ACCESS_TOKEN_EXP = 1000L * 60L * 15L; // 15분

    public JwtTokenProvider(
            @Value("${springboot.jwt.secret}") String secret,
            UserDetailsService userDetailsService) {

        log.debug("Secret : {}", secret);
        this.secretKey = new SecretKeySpec(
                secret.getBytes(StandardCharsets.UTF_8),
                Jwts.SIG.HS256.key().build().getAlgorithm()
        );
        this.userDetailsService = userDetailsService;

    }

    // AccessToken을 생성하는 메소드
    public String SecretAccessToken(String username, String role) {

        Map<String, String> claims = new HashMap<>();

        claims.put("username", username);
        claims.put("role", role);

        return createToken(claims, ACCESS_TOKEN_EXP);
    }


    private String createToken(Map<String, String> claims, long tokenExp) {

        return Jwts.builder()
                .claims(claims) // 공개 클레임
                .id(Long.toHexString(System.nanoTime())) // jti(JWT ID) 클레임
                .issuedAt(new Date()) // 발급 시간 설정
                .expiration(new Date(System.currentTimeMillis() + tokenExp)) // 만료 시간 설정
                .signWith(secretKey) // 서명을 생성
                .compact();
    }

    // 토큰이 유효한지 체크하는 메소드(토큰이 유효하면 true, 만료되었으면 false 반환)
    public boolean validateToken(String token) {

        Jws<Claims> claims = Jwts.parser().verifyWith(secretKey).build().parseSignedClaims(token);

        return claims.getPayload().getExpiration().before(new Date());
    }

    public String resolveToken(String bearerToken) {

        if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7);
        }

        return null;
    }

    // SecurityContextHolder에 저장할 Authentication 객체를 생성하는 메소드
    public Authentication getAuthentication(String token) {

        String username = getUserName(token);
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);

        return new UsernamePasswordAuthenticationToken(
                userDetails,
                null,
                userDetails.getAuthorities()
        );
    }

    private String getUserName(String token) {

        return Jwts.parser()
                .verifyWith(secretKey)
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .get("username")
                .toString();
    }

}
