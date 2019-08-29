package com.aibaiyang.idemo.controller;

import com.aibaiyang.idemo.entity.Employee;
import com.aibaiyang.idemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author gz
 * @Date 2019/8/29
 * @Description
 **/
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/findByName")
    public List<Employee> findByName(@Param("name") String name){

        return employeeService.findByName(name);

    }

}
