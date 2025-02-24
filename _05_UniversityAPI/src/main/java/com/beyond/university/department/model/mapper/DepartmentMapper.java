package com.beyond.university.department.model.mapper;

import com.beyond.university.department.model.vo.Department;
import org.apache.ibatis.annotations.Mapper;

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

    List<Department> selectAll();
}
