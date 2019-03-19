package com.assignment16.question7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        User user = new User();
        user.setUname("abc");
        user.setPwd("abc");
        user.setName("abc");
        user.setAge(12);
        user.setDob("2001-1-1");
        context.getBean(UserDAO.class).insertEntry(user);
    }
}
