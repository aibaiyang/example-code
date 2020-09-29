package service;

import com.aibaiyang.idemo.service.CourseService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author Jone Guo
 * @Date 2020/9/29 18:44
 * @Description
 **/
public class CourseServiceTest {

    @Autowired
    private CourseService courseService;

    @Test
    public void batchInsetTest(){

        courseService.batchInset();

    }

}
