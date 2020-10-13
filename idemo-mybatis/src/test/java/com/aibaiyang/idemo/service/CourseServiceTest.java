package com.aibaiyang.idemo.service;

import com.aibaiyang.idemo.IdemoApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Map;

/**
 * @Author Jone Guo
 * @Date 2020/9/29 18:44
 * @Description
 **/
public class CourseServiceTest extends IdemoApplicationTests {

    @Autowired
    private CourseService courseService;

    @Value("#{${ipMap}}")
    private Map<String,String> maps;

    @Value("#{'${ipList}'.split(',')}")
    private List<String> list;

    /**
     * 多线程测试
     *
     */
    @Test
    public void batchInsetTest(){

        courseService.batchInset();

    }


    @Test
    public void getMapAndListValue(){

        // 打印Map
        System.out.println("maps" + maps);
        // 打印List
        System.out.println("list" + list);

    }

}
