package com.assignment15.question3;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class DatabaseEventListener implements ApplicationListener<DatabaseEvent> {
    @Override
    public void onApplicationEvent(DatabaseEvent event) {
        System.out.println(event.getSource());
    }
}
