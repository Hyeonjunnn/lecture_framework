package com.beyond.university;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university
 * <p>fileName       : HomeController
 * <p>author         : hjsong
 * <p>date           : 2025-02-17
 * <p>description    :
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-17        hjsong             최초 생성
 */

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        List<String> names = Arrays.asList("홍길동", "이몽룡", "성춘향", "김철수", "김영희");

        // model.addAttribute("message", "Hello World");
        model.addAttribute("names", names);

        return "home";
    }
}
