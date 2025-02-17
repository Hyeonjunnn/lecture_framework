package com.beyond.mvc;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.mvc
 * <p>fileName       : HomeController
 * <p>author         : hjsong
 * <p>date           : 2025-02-14
 * <p>description    :
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-14        hjsong             최초 생성
 */

@Slf4j
@Controller
public class HomeController {
    // @Slf4j 어노테이션으로 인해서 아래의 선언문은 생략이 가능하다.
    // private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/")
    public String home() {

        log.info("home() 메소드 호출 - info");
        log.debug("home() 메소드 호출 - debug");

        // 뷰의 이름을 반환
        return "home";
    }

}
