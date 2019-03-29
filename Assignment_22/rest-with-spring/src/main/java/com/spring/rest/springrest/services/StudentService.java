package com.spring.rest.springrest.services;

import com.spring.rest.springrest.entities.Student;
import com.spring.rest.springrest.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public List<Student> getStudentList(){
        return (List<Student>)studentRepository.findAll();
    }
    
    public Student getStudentSingle(Long id){
        return studentRepository.findById(id).orElse(null);
    }
    
    public void createStudent(Student student){
        studentRepository.save(student);
    }
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }
    
    public void updateStudent(Student student){
       Student student1 = studentRepository.findById(student.getId()).get();
       student1.setPercentage(student.getPercentage());
       student1.setStandard(student.getStandard());
       student1.setAge(student.getAge());
       student1.setName(student.getName());
       student1.setCity(student.getCity());
        studentRepository.save(student1);
    }
}
