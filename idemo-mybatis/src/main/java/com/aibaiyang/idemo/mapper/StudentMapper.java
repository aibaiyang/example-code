package com.aibaiyang.idemo.mapper;

import com.aibaiyang.idemo.dto.FindByStudentCodesDTO;
import com.aibaiyang.idemo.dto.StudentCourseDTO;
import com.aibaiyang.idemo.dto.StudentCourseOutput;
import com.aibaiyang.idemo.entity.Student;
import com.aibaiyang.idemo.util.MyMapper;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentMapper extends MyMapper<Student> {

    Page<StudentCourseDTO> findByName(Student student);

    List<StudentCourseOutput> findAll();

    List<Student> findByStudentCodes(@Param("codesDTO") FindByStudentCodesDTO codesDTO);

}