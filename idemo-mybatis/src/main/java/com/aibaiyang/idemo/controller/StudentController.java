package com.aibaiyang.idemo.controller;

import com.aibaiyang.idemo.dto.FindByStudentCodesDTO;
import com.aibaiyang.idemo.dto.StudentCourseDTO;
import com.aibaiyang.idemo.dto.StudentCourseOutput;
import com.aibaiyang.idemo.entity.Student;
import com.aibaiyang.idemo.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author zhong guo
 * @Date 2019/10/6 11:55
 * @description
 **/
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/insert")
    public int insert(@RequestBody Student student){
        return studentService.insert(student);
    }

    /**
     * 分页查询
     * @param student
     * @param pageNo
     * @param pageSize
     * @return
     */
    @PostMapping("/findByName")
    public PageInfo<StudentCourseDTO> findByName(@RequestBody Student student,
                                                 @RequestParam(defaultValue = "1") int pageNo,
                                                 @RequestParam(defaultValue = "10") int pageSize){

        //分页
        PageHelper.startPage(pageNo,pageSize);
        //排序
        PageHelper.orderBy("s.id desc");
        PageInfo<StudentCourseDTO> pageInfo = new PageInfo<>(studentService.findByName(student));
        return pageInfo;
    }

    /**
     * 查询一对多关系的数据
     * @return
     */
    @GetMapping("/findAll")
    public List<StudentCourseOutput> findAll(){
        return studentService.findAll();
    }

    /**
     * 通过代码数组查询
     * @param dto
     * @return
     */
    @PostMapping("/findByStudentCodes")
    public List<Student> findByStudentCodes(@RequestBody FindByStudentCodesDTO dto){
        return studentService.findByStudentCodes(dto);
    }


}
