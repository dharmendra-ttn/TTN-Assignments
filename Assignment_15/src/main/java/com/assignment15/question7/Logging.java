package com.assignment15.question7;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logging {

    @Before("this(com.assignment15.question7.Services)")
    void before(JoinPoint joinPoint){
        System.out.println("Entering "+ joinPoint.getSignature());
    }

    @After("this(com.assignment15.question7.Services)")
    void after(JoinPoint joinPoint){
        System.out.println("Exiting "+ joinPoint.getSignature());
    }

    
//
//    @Before("within(com.assignment15.question7.*)")
//    void before(JoinPoint joinPoint){
//        System.out.println("Entering "+ joinPoint.getSignature());
//    }
//    @After("within(com.assignment15.question7.*)")
//    void after(JoinPoint joinPoint){
//        System.out.println("Exiting "+ joinPoint.getSignature());
//    }
//

//
//    @Before("execution(void method*())")
//    void before(JoinPoint joinPoint){
//        System.out.println("Entering "+ joinPoint.getSignature());
//    }
//
//    @After("execution(void method*()))")
//    void after(JoinPoint joinPoint){
//        System.out.println("Exiting "+ joinPoint.getSignature());
//    }

//
//
//    @Before("args()")
//    void before(JoinPoint joinPoint){
//        System.out.println("Entering "+ joinPoint.getSignature());
//    }
//
//    @After("args()")
//    void after(JoinPoint joinPoint){
//        System.out.println("Exiting "+ joinPoint.getSignature());
//    }
//
//
//    @Before("bean(service)")
//    void before(JoinPoint joinPoint){
//        System.out.println("Entering "+ joinPoint.getSignature());
//    }
//
//    @After("bean(service)")
//    void after(JoinPoint joinPoint){
//        System.out.println("Exiting "+ joinPoint.getSignature());
//    }

}
