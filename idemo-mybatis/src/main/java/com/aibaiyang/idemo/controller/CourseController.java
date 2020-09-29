package com.aibaiyang.idemo.controller;

import com.aibaiyang.idemo.entity.Course;
import com.aibaiyang.idemo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @ResponseBody
    public int insert(@RequestBody Course course){

        return courseService.insert(course);

    }

}
