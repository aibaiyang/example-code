package com.aibaiyang.idemo.controller;

import com.aibaiyang.idemo.entity.Account;
import com.aibaiyang.idemo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhong guo
 * @Date 2019/10/5 23:18
 * @description
 **/
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findByName")
    @ResponseBody
    public Account findByName(@RequestParam("name") String name){

       return accountService.findByName(name);

    }

}
