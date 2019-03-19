package com.assignment16.question2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_config.xml");
        applicationContext.getBean(UserDAO.class).insertData();
    }
}
