package com.beyond.university.subject.model.service;

import com.beyond.university.subject.model.mapper.SubjectMapper;
import com.beyond.university.subject.model.vo.Subject;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.department.model.service
 * <p>fileName       : DepartmentServiceImpl
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

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {

    private final SubjectMapper subjectMapper;

    @Override
    public int getTotalCountByDeptNo(String deptNo) {

        return subjectMapper.selectSubjectsCountByDeptNo(deptNo);
    }

    @Override
    public List<Subject> getSubjectsByDeptNo(int page, int numOfRows, String deptNo) {

        int limit = numOfRows;
        int offset = (page - 1) * limit;

        RowBounds rowBounds = new RowBounds(offset, limit);

        return subjectMapper.selectSubjectsByDeptNo(deptNo, rowBounds);
    }

}
