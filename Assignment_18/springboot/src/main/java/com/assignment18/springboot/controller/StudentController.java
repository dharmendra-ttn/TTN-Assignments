package com.assignment18.springboot.controller;

import com.assignment18.springboot.entity.Student;
import com.assignment18.springboot.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    
    Logger logger = LoggerFactory.getLogger(StudentController.class);
    
    @Autowired
    StudentService studentService;
    
    @GetMapping("/student")
    public List<Student> getStudent(){
        logger.trace("Calling student service getStudent method");
        return studentService.getStudent();
    }
}
