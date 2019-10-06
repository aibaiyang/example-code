package com.aibaiyang.idemo.service;

import com.aibaiyang.idemo.entity.Course;

/**
 * @Author zhong guo
 * @Date 2019/10/6 11:45
 * @description
 **/
public interface CourseService {

    /**
     * 新增数据
     * @param course
     * @return
     */
    int insert(Course course);

}
