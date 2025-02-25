package com.beyond.university.subject.model.mapper;

import com.beyond.university.subject.model.vo.Subject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

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
public interface SubjectMapper {

    int selectSubjectsCountByDeptNo(@Param("deptNo") String deptNo);

    List<Subject> selectSubjectsByDeptNo(@Param("deptNo") String deptNo, RowBounds rowBounds);
}
