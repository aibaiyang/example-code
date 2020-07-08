package com.aibaiyang.idemo.service;

import com.aibaiyang.idemo.dto.FindByStudentCodesDTO;
import com.aibaiyang.idemo.dto.StudentCourseDTO;
import com.aibaiyang.idemo.dto.StudentCourseOutput;
import com.aibaiyang.idemo.entity.Student;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * @Author zhong guo
 * @Date 2019/10/6 11:40
 * @description
 **/
public interface StudentService {

    /**
     * 新增数据
     * @param student
     * @return
     */
    int insert(Student student);

    /**
     * 通过名称查询学生
     * @param student
     * @return
     */
    Page<StudentCourseDTO> findByName(Student student);

    /**
     * 查询所有数据
     * @return
     */
    List<StudentCourseOutput> findAll();

    /**
     * 通过代码数组查询
     *
     * @param dto
     * @return
     */
    List<Student> findByStudentCodes(FindByStudentCodesDTO dto);

}
