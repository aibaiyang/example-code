package com.aibaiyang.idemo.service.impl;

import com.aibaiyang.idemo.entity.Course;
import com.aibaiyang.idemo.mapper.CourseMapper;
import com.aibaiyang.idemo.service.CourseService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @Author zhong guo
 * @Date 2019/10/6 11:46
 * @description
 **/
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Override
    public int insert(Course course) {
        return courseMapper.insert(course);
    }

    @Override
    public int batchInset() {

        List<String> courseLists = Lists.newArrayList("chinese" ,"english" ,"match");
        CountDownLatch countDownLatch = new CountDownLatch(courseLists.size());

        for (String course : courseLists) {

            threadPoolTaskExecutor.submit(() ->{
                // 执行业务
                System.out.println("课程：" + course);
                if("english".equals(course)){
                    throw new RuntimeException("课程错误！");
                }
                // 线程计数减1
                countDownLatch.countDown();
            });

        }

        try {
            countDownLatch.await(5L , TimeUnit.SECONDS);
            System.out.println("threadSum:" + countDownLatch.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("执行完成");
        return 0;

    }


}
