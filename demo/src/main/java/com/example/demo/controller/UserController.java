package com.example.demo.controller;

import com.example.demo.model.AoaUser;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/userList")
    public List<Map<String ,Object>> userList(AoaUser aoaUser){
        return  userService.userList(aoaUser);
    }
}
