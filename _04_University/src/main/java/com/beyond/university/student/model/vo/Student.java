package com.beyond.university.student.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.student.model.vo
 * <p>fileName       : Student
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
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String no;

    private String deptNo;

    private String name;

    private String ssn;

    private String address;

    private LocalDate entranceDate;

    private String absenceYn;

    private String coachProfessorNo;
}
