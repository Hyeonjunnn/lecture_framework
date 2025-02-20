package com.beyond.university.student.model.dto;

import com.beyond.university.student.model.vo.Student;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.student.model
 * <p>fileName       : StudentsDto
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
@Getter
@ToString
public class StudentsDto {
    private final String no;

    private final String name;

    private final String address;

    private final String absenceYn;

    public StudentsDto(Student student) {
        this.no = student.getNo();
        this.name = student.getName();
        this.address = student.getAddress();
        this.absenceYn = student.getAbsenceYn();
    }

}
