package com.assignment16.question6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_config.xml");
        applicationContext.getBean(UserDAO.class).getName(scanner.next());
    }
}
