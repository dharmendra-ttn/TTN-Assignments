package com.assignment15.question5;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        Demo demo = context.getBean(Demo.class);
        demo.m1();
        demo.m2();
    }
}
