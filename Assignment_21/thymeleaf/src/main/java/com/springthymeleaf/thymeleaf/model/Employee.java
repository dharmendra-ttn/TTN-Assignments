package com.springthymeleaf.thymeleaf.model;


import com.springthymeleaf.thymeleaf.enums.Roles;

public class Employee {
    private String userName;
    private String passWord;
    private Boolean isAdmin;
    private Roles msg;
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassWord() {
        return passWord;
    }
    
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    public Boolean getIsAdmin() {
        return isAdmin;
    }
    
    public void setIsAdmin(Boolean admin) {
        isAdmin = admin;
    }
    
    public Roles getMsg() {
        return msg;
    }
    
    public void setMsg(Roles msg) {
        this.msg = msg;
    }
}
