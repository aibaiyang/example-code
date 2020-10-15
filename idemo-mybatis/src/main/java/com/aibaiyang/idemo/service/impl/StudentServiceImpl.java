package com.aibaiyang.idemo.service.impl;

import com.aibaiyang.idemo.dto.FindByStudentCodesDTO;
import com.aibaiyang.idemo.dto.StudentCourseDTO;
import com.aibaiyang.idemo.dto.StudentCourseOutput;
import com.aibaiyang.idemo.entity.Student;
import com.aibaiyang.idemo.mapper.StudentMapper;
import com.aibaiyang.idemo.service.StudentService;
import com.github.pagehelper.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zhong guo
 * @Date 2019/10/6 11:41
 * @description
 **/
@Service
public class StudentServiceImpl implements StudentService {

    final Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int insert(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public Page<StudentCourseDTO> findByName(Student student) {
//        logger.info("入参student={}" ,student);
        return studentMapper.findByName(student);
    }

    @Override
    public List<StudentCourseOutput> findAll() {
        return studentMapper.findAll();
    }

    @Override
    public List<Student> findByStudentCodes(FindByStudentCodesDTO dto) {
        List<Student> students =studentMapper.findByStudentCodes(dto);
        return students;
    }


}
