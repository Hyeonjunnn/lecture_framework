package com.beyond.university.department.model.service;

import com.beyond.university.department.model.dto.DepartmentsDto;
import com.beyond.university.department.model.vo.Department;

import java.util.List;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.department.model.service
 * <p>fileName       : DepartmentService
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
public interface DepartmentService {

    List<Department> getDepartments();

    Department getDepartmentByNo(String deptNo);
}
