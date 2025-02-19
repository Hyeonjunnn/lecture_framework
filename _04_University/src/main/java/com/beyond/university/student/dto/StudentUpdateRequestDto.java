package com.beyond.university.student.dto;

import com.beyond.university.student.model.vo.Student;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.student.dto
 * <p>fileName       : StudentUpdateRequestDto
 * <p>author         : hjsong
 * <p>date           : 2025-02-19
 * <p>description    :
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-19        hjsong             최초 생성
 */

// @Getter
// @ToString
// @RequiredArgsConstructor
public record StudentUpdateRequestDto(String no, String deptNo, String name, String ssn, String address, String absenceYn) {

    public Student toStudent() {
        return Student.builder()
                .no(no)
                .deptNo(deptNo)
                .name(name)
                .ssn(ssn)
                .address(address)
                .absenceYn(absenceYn)
                .build();
    }
}
