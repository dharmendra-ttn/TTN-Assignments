package com.assignment18.springboot.controller;

import com.assignment18.springboot.entity.Database;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {
    
    Logger logger = LoggerFactory.getLogger(DatabaseController.class);
    
    @Autowired
    Database database;
    
    @GetMapping("/db")
    String database(){
        logger.info("Passing Database toString value");
        return database.toString();
    }
}
