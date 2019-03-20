package com.spring.demo.controller;

import org.springframework.stereotype.Component;

@Component
public class User {
    String fname;
    String lname;
    
    public String getFname() {
        return fname;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }
    
    public String getLname() {
        return lname;
    }
    
    public void setLname(String lname) {
        this.lname = lname;
    }
}
