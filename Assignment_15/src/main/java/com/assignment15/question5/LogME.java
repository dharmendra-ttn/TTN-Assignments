package com.assignment15.question5;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogME {
    @Before("execution(* *(..))")
    void beforeLog(){
        System.out.println("Before Method");
    }
    
    @After("execution(* *(..))")
    void afterLog(){
        System.out.println("After Method");
    }
}
