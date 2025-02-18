package com.beyond.university.department.model.dto;

import com.beyond.university.department.model.vo.Department;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.department.model.dto
 * <p>fileName       : DepartmentsDto
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

@Getter
@ToString
@RequiredArgsConstructor
public class DepartmentsDto {

    private final String no;

    private final String name;

    public DepartmentsDto(Department department) {
        this.no = department.getNo();
        this.name = department.getName();
    }
}
