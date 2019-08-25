package com.aibaiyang.idemo.controller;

import com.aibaiyang.idemo.entity.Employee;
import com.aibaiyang.idemo.service.EmployeeService;
import com.aibaiyang.idemo.thread.FirstThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/findAll")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Employee employee){

        employeeService.add(employee);
        FirstThread firstThread = new FirstThread(employeeService);
        firstThread.start();
        System.out.println("新增成功");

    }


}
