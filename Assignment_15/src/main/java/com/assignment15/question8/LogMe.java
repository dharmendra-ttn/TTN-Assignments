package com.assignment15.question8;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogMe {
    
    @Pointcut("execution(void display())")
    void displayPointCut(){}
    
    @After("displayPointCut()")
    void after(){
        System.out.println("After");
    }
    
}
