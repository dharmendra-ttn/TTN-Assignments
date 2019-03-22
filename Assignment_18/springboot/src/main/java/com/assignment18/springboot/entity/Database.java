package com.assignment18.springboot.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

public class Database {
    
    Logger logger = LoggerFactory.getLogger(Database.class);
    
    @Value("${database.port}")
    int port;
    @Value("${database.name}")
    String name;
    
    @Override
    public String toString() {
        logger.debug("database toString Method");
        return "Database{" +
                "port=" + port +
                ", name=" + name +
                '}';
    }
}
