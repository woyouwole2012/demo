package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getname")
    public String getName(){
        return userService.getUser();
    }


    @PostMapping("/getUser")
    public String getUser(String user, String passwd){

        return user + ":" + passwd;

    }

}
