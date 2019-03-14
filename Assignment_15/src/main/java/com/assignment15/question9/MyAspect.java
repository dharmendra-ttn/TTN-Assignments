package com.assignment15.question9;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
    @Before("execution(void run(Integer))")
    void before(JoinPoint jp){
        System.out.println("Before");
        System.out.println(jp.getSignature());
        for(Object o : jp.getArgs()){
            System.out.println(o);
        }
    }
}
