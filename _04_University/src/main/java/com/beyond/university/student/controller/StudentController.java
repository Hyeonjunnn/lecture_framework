package com.beyond.university.student.controller;

import com.beyond.university.department.model.service.DepartmentService;
import com.beyond.university.department.model.vo.Department;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class StudentController {
    private final DepartmentService departmentService;

    @GetMapping("/student/search")
    public ModelAndView search(ModelAndView modelAndView) {
        List<Department> departments = departmentService.getDepartments();

        System.out.println(departments);
        System.out.println(departments.size());

        modelAndView.setViewName("student/search");

        return modelAndView;
    }
}