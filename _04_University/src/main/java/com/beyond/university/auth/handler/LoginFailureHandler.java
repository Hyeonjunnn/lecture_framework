package com.beyond.university.auth.handler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.auth.handler
 * <p>fileName       : LoginFailureHandler
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

public class LoginFailureHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request,
                                        HttpServletResponse response,
                                        AuthenticationException exception) throws IOException, ServletException {

        String message = "";
        if (exception instanceof UsernameNotFoundException) {
            message = "존재하지 않는 사용자입니다.";

        } else if (exception instanceof BadCredentialsException) {
            message = "아이디 또는 비밀번호가 틀립니다.";

        } else if (exception instanceof LockedException) {
            message = "잠긴 계정입니다.";

        } else if (exception instanceof DisabledException) {
            message = "탈퇴한 계정입니다.";

        } else if (exception instanceof AccountExpiredException) {
            message = "만료된 계정입니다.";

        } else if (exception instanceof CredentialsExpiredException) {
            message = "비밀번호가 만료되었습니다.";

        }

        response.sendRedirect("/login?error=" + URLEncoder.encode(message, StandardCharsets.UTF_8));
    }

}
