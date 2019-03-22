package com.assignment18.springboot.controller;

import com.assignment18.springboot.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {
    
    Logger logger = LoggerFactory.getLogger(UserController.class);
    
    
    @Autowired
    User user;
    
    @GetMapping("/user")
    public String user(){
        logger.info("passing user toString value");
        return user.toString();
    }
}

