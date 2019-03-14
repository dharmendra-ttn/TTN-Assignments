package com.assignment15.question1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring_config.xml");
        ctx.start();
        ctx.stop();
        ctx.close();
    }
}
