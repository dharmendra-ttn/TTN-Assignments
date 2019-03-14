package com.assignment15.question9;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring_config.xml");
        Demo5 demo5 = ctx.getBean(Demo5.class);
        demo5.run(10);
    }
}
