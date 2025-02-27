package com.beyond.university.auth.jwt;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.auth.jwt
 * <p>fileName       : JwtAuthenticationFilter
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
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final JwtTokenProvider jwtTokenProvider;

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

        // 1. HttpServletRequest에서 토큰을 추출
        String token = jwtTokenProvider.resolveToken(request.getHeader("Authorization"));

        // 2. 추출한 토큰의 유효성을 검사
        if (token != null && jwtTokenProvider.validateToken(token)) {

            // 3. Authentication 객체를 생성 후 SecurityContextHolder에 저장
            Authentication authentication = jwtTokenProvider.getAuthentication(token);

            SecurityContextHolder.getContext().setAuthentication(authentication);
        }

        filterChain.doFilter(request, response);

    }

}
