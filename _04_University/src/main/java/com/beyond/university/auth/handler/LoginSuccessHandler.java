package com.beyond.university.auth.handler;

import com.beyond.university.auth.model.vo.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import java.io.IOException;
import java.util.List;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.auth.handler
 * <p>fileName       : LoginSuccessHandler
 * <p>author         : hjsong
 * <p>date           : 2025-02-21
 * <p>description    :
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-21        hjsong             최초 생성
 */

@Slf4j
public class LoginSuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {

        // 사용자 권한 정보 얻어오기
        // 1. 사용자 계정에 여러 개의 권한이 있는 경우
        // List<String> roleNames = authentication.getAuthorities()
        //         .stream()
        //         .map(GrantedAuthority::getAuthority)
        //         .toList();
        //
        // if (roleNames.contains("ROLE_ADMIN")) {
        //     response.sendRedirect("/admin/info");
        // } else {
        //     response.sendRedirect("/");
        // }

        // 2. 사용자 계정에 한 개의 권한이 있는 경우
        User user = (User) authentication.getPrincipal();

        log.info("ROLE_NAME : {}", user.getRole());

        if (user.getRole().equals("ROLE_ADMIN")) {
            response.sendRedirect("/admin/info");
        } else {
            response.sendRedirect("/");
        }

    }


}
