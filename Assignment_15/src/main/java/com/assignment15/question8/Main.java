package com.assignment15.question8;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        CheckMe checkMe = context.getBean(CheckMe.class);
        checkMe.display();
    }
}
