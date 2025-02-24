package com.beyond.university.department.model.mapper;

import com.beyond.university.department.model.vo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Optional;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.department.model.service
 * <p>fileName       : DepartmentMapper
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

@Mapper
public interface DepartmentMapper {

    int selectDepartmentsCount(@Param("openYn") String openYn);

    List<Department> selectAll(@Param("openYn") String openYn, RowBounds rowBounds);

    Optional<Department> selectDepartmentByNo(@Param("deptNo") String deptNo);

    void insertDepartment(Department department);
}
