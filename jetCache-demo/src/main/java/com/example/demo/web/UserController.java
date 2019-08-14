package com.example.demo.web;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAll")
    public List<User> getAll(@RequestParam String code) {
        return userService.getAll(code);
    }

    @PostMapping("/add")
    public void add(@RequestBody User user) {
        userService.add(user);
    }

    @PostMapping("/update")
    public void update(@RequestBody User user) {
        userService.update(user);
    }

    @PostMapping("/delete")
    public void delete(@RequestParam User user) {
        userService.delete(user);
    }

}
