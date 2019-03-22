package com.assignment18.springboot.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {
    Logger logger = LoggerFactory.getLogger(User.class);
    String userName;
    String password;
    
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        logger.debug("user toString method");
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
