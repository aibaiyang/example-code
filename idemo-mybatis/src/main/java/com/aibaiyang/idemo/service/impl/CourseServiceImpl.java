package com.aibaiyang.idemo.service.impl;

import com.aibaiyang.idemo.entity.Course;
import com.aibaiyang.idemo.mapper.CourseMapper;
import com.aibaiyang.idemo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zhong guo
 * @Date 2019/10/6 11:46
 * @description
 **/
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public int insert(Course course) {
        return courseMapper.insert(course);
    }


}
