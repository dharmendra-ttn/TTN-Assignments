package com.assignment15.question6;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Demo2 {
    void a() throws IOException{
        System.out.println("a");
        throw new IOException();
    }
    void b(){
        System.out.println("b");
    }
    void c() throws IOException{
        System.out.println("c");
        throw new IOException();
    }
}
