package com.beyond.university.department.model.vo;

import com.beyond.university.student.model.vo.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.department.model.vo
 * <p>fileName       : Department
 * <p>author         : hjsong
 * <p>date           : 2025-02-18
 * <p>description    :
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-18        hjsong             최초 생성
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    private String no;

    private String name;

    private String category;

    private String openYn;

    private int capacity;

    private List<Student> students;
}
