package com.beyond.university.student.model.service;

import com.beyond.university.student.mapper.StudentMapper;
import com.beyond.university.student.model.vo.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.student.model.service
 * <p>fileName       : StudentServiceImpl
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
public class StudentServiceImpl implements StudentService {
    private final StudentMapper studentMapper;

    @Override
    public List<Student> getStudentsByDeptNo(String deptNo){

        return studentMapper.selectAllByDeptNo(deptNo);
    }

    @Override
    public Student getStudentByNo(String sno) {

        return studentMapper.selectStudentByNo(sno);
    }

    @Override
    @Transactional
    public int save(Student student){
        int result = 0;

        if (student.getNo() != null) {
            // update
            result = studentMapper.updateStudent(student);

        } else {
            // insert
            result = studentMapper.insertStudent(student);

        }

        return result;
    }

    @Override
    @Transactional
    public int delete(String sno) {

        return studentMapper.deleteStudent(sno);
    }

}
