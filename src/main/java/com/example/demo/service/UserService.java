package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class UserService {

    Logger logger = LoggerFactory.getLogger(UserService.class);

    public String getUser(){

        logger.info("log--log----");
        return System.currentTimeMillis()+"";
    }
}
