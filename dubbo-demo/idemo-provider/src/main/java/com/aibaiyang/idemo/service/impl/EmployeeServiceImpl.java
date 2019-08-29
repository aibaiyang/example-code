package com.aibaiyang.idemo.service.impl;

import com.aibaiyang.idemo.dao.EmployeeRepository;
import com.aibaiyang.idemo.entity.Employee;
import com.aibaiyang.idemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author gz
 * @Date 2019/8/14
 * @Description
 **/
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findByName(String name) {
        return employeeRepository.findByName(name);
    }


}
