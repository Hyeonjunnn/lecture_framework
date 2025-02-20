package com.beyond.university.department.model.mapper;

import com.beyond.university.department.model.dto.DepartmentsDto;
import com.beyond.university.department.model.vo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.department.model.mapper
 * <p>fileName       : DepartmentMapper
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

@Mapper
public interface DepartmentMapper {
    List<Department> selectAll();

    Department selectDepartmentByNo(@Param("deptNo") String deptNo);
}
