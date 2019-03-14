package com.assignment15.question6;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Aspect
public class LogDemo {
    
    @AfterThrowing(value = "execution(* *(..))" ,throwing = "ioException")
    void after(JoinPoint joinPoint, IOException ioException){
        System.out.println("After "+joinPoint.getSignature());
    }
    
}
