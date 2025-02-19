package com.beyond.university.student.model.service;

import com.beyond.university.student.model.vo.Student;

import java.util.List;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.student.model.service
 * <p>fileName       : StudentService
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
public interface StudentService {
    public List<Student> getStudentsByDeptNo(String deptNo);

    public Student getStudentByNo(String sno);

    public int save(Student student);

    public int delete(String sno);
}
