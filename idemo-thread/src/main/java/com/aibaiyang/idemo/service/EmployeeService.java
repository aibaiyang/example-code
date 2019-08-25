package com.aibaiyang.idemo.service;

import com.aibaiyang.idemo.entity.Employee;

import java.util.List;

/**
 * @Author gz
 * @Date 2019/8/14
 * @Description
 **/
public interface EmployeeService {

    /**
     * 通过名称查询数据
     * @return
     *
     */
    List<Employee> findByName(String name);

    /**
     * 无条件查询数据
     * @return
     */
    List<Employee> findAll();

    /**
     * 新增雇员
     * @param employee
     */
    void add(Employee employee);

}
