package com.aibaiyang.idemo.thread;

import com.aibaiyang.idemo.entity.Employee;
import com.aibaiyang.idemo.service.EmployeeService;

import java.util.List;

public class FirstThread extends Thread {

    private EmployeeService employeeService;

    public FirstThread(EmployeeService employeeService){
        super();
        this.employeeService = employeeService;
    }

    @Override
    public void run(){

        List<Employee> employees = employeeService.findAll();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("子线程：" + getName());
        System.out.println(employees);

    }

}
