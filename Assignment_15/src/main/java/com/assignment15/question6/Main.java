package com.assignment15.question6;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        Demo2 demo2 = context.getBean(Demo2.class);
        try {
            demo2.a();
        }catch (IOException e){
        }
        try {
            demo2.b();
        }catch (Exception e){
        }
        try {
            demo2.c();
        }catch (IOException e){
        }
    }
    
}
