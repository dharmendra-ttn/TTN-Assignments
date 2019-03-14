package com.assignment15.question3;

import org.springframework.context.ApplicationEvent;

public class DatabaseEvent extends ApplicationEvent {
    DatabaseEvent(Object object){
        super(object);
    }
}
