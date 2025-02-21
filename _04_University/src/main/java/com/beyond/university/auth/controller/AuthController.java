package com.beyond.university.auth.controller;

import com.beyond.university.auth.model.mapper.AuthMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.auth.controller
 * <p>fileName       : AuthController
 * <p>author         : hjsong
 * <p>date           : 2025-02-20
 * <p>description    :
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-20        hjsong             최초 생성
 */

@Slf4j
@Controller
public class AuthController {

    @GetMapping("/login")
    public String login() {
      
        log.info("로그인 페이지 요청");

        return "auth/login";
    }
}
