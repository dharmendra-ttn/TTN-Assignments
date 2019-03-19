package com.assignment16.question11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        UserDAO userDAO=context.getBean(UserDAO.class);
        userDAO.countUser();
    }
}
