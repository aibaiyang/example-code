package com.aibaiyang.idemo.controller;

import com.aibaiyang.idemo.entity.Course;
import com.aibaiyang.idemo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhong guo
 * @Date 2019/10/6 11:53
 * @description
 **/
@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/insert")
    public int insert(@RequestBody Course course){

        return courseService.insert(course);

    }

}
