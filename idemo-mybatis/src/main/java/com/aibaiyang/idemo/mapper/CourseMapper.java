package com.aibaiyang.idemo.mapper;

import com.aibaiyang.idemo.entity.Course;
import com.aibaiyang.idemo.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseMapper extends MyMapper<Course> {
}