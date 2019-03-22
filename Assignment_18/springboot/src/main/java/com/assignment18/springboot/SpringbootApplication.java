package com.assignment18.springboot;

import com.assignment18.springboot.entity.Database;
import com.assignment18.springboot.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootApplication {
    
    
    @Bean
    User user() {
        return new User("abc", "xyz");
    }
    
    
    @Bean
    Database database() {
        return new Database();
    }
    
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
    
    
}
