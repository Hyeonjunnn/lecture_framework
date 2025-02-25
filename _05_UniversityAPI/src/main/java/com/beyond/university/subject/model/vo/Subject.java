package com.beyond.university.subject.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.subject.vo
 * <p>fileName       : Subject
 * <p>author         : hjsong
 * <p>date           : 2025-02-25
 * <p>description    :
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-25        hjsong             최초 생성
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Subject {

    private String classNo;

    private String deptNo;

    private String preClassNo;

    private String name;

    private String type;
}
