package com.aibaiyang.idemo.dto;

import com.aibaiyang.idemo.entity.Course;
import lombok.Data;

import java.util.List;

/**
 * @Author zhong guo
 * @Date 2019/10/6 15:37
 * @description
 **/
@Data
public class StudentCourseOutput {

    private Integer id;

    private String name;

    private List<Course> courses;

}
