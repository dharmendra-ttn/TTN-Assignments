package com.assignment18.springboot.service;

import com.assignment18.springboot.entity.Student;
import com.assignment18.springboot.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Service
public class StudentService {
    Logger logger = LoggerFactory.getLogger(StudentService.class);
    
    @Autowired
    StudentRepository studentRepository;
//    public List<Student> getStudent(){
//        logger.info("Passing ArrayList of Students");
//        return Arrays.asList(new Student(1,"Dharmendra","Noida"), new Student(2,"Ankit","Ghaziabad"));
//    }
    public List<Student> getStudent(){
        logger.info("Passing student data");
        List<Student> list = new ArrayList<>();
        Iterator<Student> iterator = studentRepository.findAll().iterator();
        iterator.forEachRemaining(list::add);
        return list;
    }
}
