package com.assignment15.question7;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        Services services = context.getBean(Services.class);
        services.method1();
        services.method2();
        services.method3();
        services.method4();
    }
}
