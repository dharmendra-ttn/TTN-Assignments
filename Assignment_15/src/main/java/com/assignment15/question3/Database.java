package com.assignment15.question3;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class Database implements ApplicationEventPublisherAware {
    int port;
    String name;
    
    ApplicationEventPublisher applicationEventPublisher;
    void connect() {
        DatabaseEvent databaseEvent = new DatabaseEvent(this);
        System.out.println("Database Connect Method Invoked");
        applicationEventPublisher.publishEvent(databaseEvent);
    }
    
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
