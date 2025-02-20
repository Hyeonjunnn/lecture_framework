package com.beyond.university.department.model.service;

import com.beyond.university.department.model.dto.DepartmentsDto;
import com.beyond.university.department.model.mapper.DepartmentMapper;
import com.beyond.university.department.model.vo.Department;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.department.model.service
 * <p>fileName       : DepartmentServiceImpl
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

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentMapper departmentMapper;

    @Override
    public List<Department> getDepartments() {

        return departmentMapper.selectAll();
    }

    @Override
    public Department getDepartmentByNo(String deptNo) {

        return departmentMapper.selectDepartmentByNo(deptNo);
    }
}
