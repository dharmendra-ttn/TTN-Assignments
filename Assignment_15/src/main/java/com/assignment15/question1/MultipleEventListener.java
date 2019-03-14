package com.assignment15.question1;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class MultipleEventListener{
    @EventListener(ContextStartedEvent.class)
    public void start(){
        System.out.println("ContextStart Event Triggered");
    }
    @EventListener(ContextStoppedEvent.class)
    public void stop(){
        System.out.println("ContextStopped Event Triggered");
    }
    @EventListener(ContextClosedEvent.class)
    public void close(){
        System.out.println("ContextClosed Event Triggered");
    }
}
