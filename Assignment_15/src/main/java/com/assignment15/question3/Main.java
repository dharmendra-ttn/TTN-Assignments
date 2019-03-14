package com.assignment15.question3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring_config.xml");
        Database database = ctx.getBean(Database.class);
        database.connect();
    }
}
