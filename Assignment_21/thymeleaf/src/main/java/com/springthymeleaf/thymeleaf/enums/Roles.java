package com.springthymeleaf.thymeleaf.enums;

public enum Roles {
    USER("This is User"),
    ADMIN("This is Admin"),
    SUPER_ADMIN("This is SuoerAdmin");
    String value;
    Roles(String roles){
        value = roles;
    }
    public String getValue(){
        return value;
    }
}
