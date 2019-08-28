package com.aibaiyang.idemo.dao;

import com.aibaiyang.idemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author gz
 * @Date 2019/8/14
 * @Description
 **/
@Repository
public interface EmployeeRepository extends JpaRepository<Employee ,Integer> {


    /**
     * 原生SQL查询
     * @param name
     * @return
     */
    @Query(nativeQuery = true , value = "select * from employee where name = :name")
    List<Employee> findByName(@Param("name") String name);

}
