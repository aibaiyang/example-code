package com.aibaiyang.idemo.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author zhong guo
 * @Date 2020/7/8 22:51
 * @description
 **/
@Data
public class FindByStudentCodesDTO implements Serializable {

    private List<String> codes;

    private String name;

}
