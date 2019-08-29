package com.aibaiyang.idemo.service;

import com.aibaiyang.idemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author gz
 * @Date 2019/8/14
 * @Description
 **/
@Service
public interface EmployeeService {

    /**
     * 通过名称查询数据
     * @return
     *
     */
    List<Employee> findByName(String name);

}
