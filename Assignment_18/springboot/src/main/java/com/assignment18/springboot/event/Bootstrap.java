package com.assignment18.springboot.event;

import com.assignment18.springboot.entity.Student;
import com.assignment18.springboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Component
public class Bootstrap {
    @Autowired
    StudentRepository studentRepository;
    
    @EventListener(ApplicationStartedEvent.class)
    public void init(){
        Iterator<Student> iterator = studentRepository.findAll().iterator();
        
        if(!iterator.hasNext()){
            for(int i=0;i<5;i++){
                studentRepository.save(new Student(i ,"Name"+i,"Address"+i));
                System.out.println("Student"+i + " data created");
            }
        }
    }
}
