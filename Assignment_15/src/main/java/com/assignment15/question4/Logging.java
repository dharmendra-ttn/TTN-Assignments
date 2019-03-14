package com.assignment15.question4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logging {
    
    @Before("this(com.assignment15.question4.Services)")
    void before(JoinPoint joinPoint){
        System.out.println("Entering "+ joinPoint.getSignature());
    }
    
    @After("this(com.assignment15.question4.Services)")
    void after(JoinPoint joinPoint){
        System.out.println("Exiting "+ joinPoint.getSignature());
    }
}
