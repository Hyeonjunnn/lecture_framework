package com.beyond.university.department.model.service;

import com.beyond.university.department.model.vo.Department;

import java.util.List;
import java.util.Optional;

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
public interface DepartmentService {

    int getTotalCount(String openYn);

    List<Department> getDepartments(int page, int numOfRows, String openYn);

    Optional<Department> getDepartmentByNo(String deptNo);

    void save(Department department);
}
