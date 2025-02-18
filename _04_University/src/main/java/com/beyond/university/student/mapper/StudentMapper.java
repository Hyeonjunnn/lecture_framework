package com.beyond.university.student.mapper;

import com.beyond.university.student.model.vo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.student.mapper
 * <p>fileName       : StudentMapper
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
public interface StudentMapper {
    List<Student> selectAllByDeptNo(@Param("deptNo") String deptNo);
}
