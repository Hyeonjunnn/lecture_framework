package com.beyond.university.subject.model.service;

import com.beyond.university.subject.model.vo.Subject;

import java.util.List;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.department.model.service
 * <p>fileName       : DepartmentService
 * <p>author         : hjsong
 * <p>date           : 2025-02-21
 * <p>description    :
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-21        hjsong             최초 생성
 */
public interface SubjectService {

    int getTotalCountByDeptNo(String depNo);

    List<Subject> getSubjectsByDeptNo(int page, int numOfRows, String deptNo);
}
