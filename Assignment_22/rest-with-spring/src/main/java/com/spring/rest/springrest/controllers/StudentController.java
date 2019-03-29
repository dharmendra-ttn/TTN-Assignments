package com.spring.rest.springrest.controllers;

import com.spring.rest.springrest.entities.Post;
import com.spring.rest.springrest.entities.Student;
import com.spring.rest.springrest.exceptions.UserNotFoundException;
import com.spring.rest.springrest.services.StudentService;
import com.spring.rest.springrest.versioning.Name;
import com.spring.rest.springrest.versioning.StudentV1;
import com.spring.rest.springrest.versioning.StudentV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.List;
import java.util.Locale;

@RestController
public class StudentController {
    @Autowired
    MessageSource messageSource;
    @Autowired
    StudentService studentService;
    
    @GetMapping("/")
    String helloMessage(@RequestHeader(name = "Accept-Language", required = false)Locale locale){
        return messageSource.getMessage("good.morning.message",null,locale);
    }
    
    @GetMapping("/students")
    List<Student> getStudents(){
        return studentService.getStudentList();
    }
    @GetMapping("/students/{id}")
    Student getStudent(@PathVariable Long id){
        Student student =studentService.getStudentSingle(id);
        if(student==null){
            throw new UserNotFoundException("Student does not exist");
        }
        return studentService.getStudentSingle(id);
    }
    
    @PostMapping("/students")
    void addStudent(@Valid @RequestBody Student student){
        studentService.createStudent(student);
    }
    @DeleteMapping("/students/{id}")
    void deleteStudents(@PathVariable Long id ){
        Student student =studentService.getStudentSingle(id);
        if(student==null){
            throw new UserNotFoundException("Student does not exist");
        }
        studentService.deleteStudent(id);
    }
    @PutMapping("/students")
    void updateStudent(@RequestBody Student student){
        Student student1 =studentService.getStudentSingle(student.getId());
        if(student1==null){
            throw new UserNotFoundException("Student does not exist");
        }
        studentService.updateStudent(student1);
    }
    
    //URI Versioning
    
    @GetMapping("/student/V1")
    StudentV1 getStudentV1() {
        return new StudentV1("Peter Parker");
    }
    
    @GetMapping("/student/V2")
    StudentV2 getStudentV2() {
        return new StudentV2(new Name("Peter","Parker"));
    }
    
    //Parameter Versioning
    @GetMapping(value = "/student/param",params = "version=1")
    StudentV1 getStudentParam1() {
        return new StudentV1("Peter Parker");
    }
    
    @GetMapping(value = "/student/param",params = "version=2")
    StudentV2 getStudentParam2() {
        return new StudentV2(new Name("Peter","Parker"));
    }
    
    
    //Header Versioning
    //API-VERSION 1 header required with request
    @GetMapping(value = "/student/header",headers = "API-VERSION=1")
    StudentV1 getPersonHeader1() {
        return new StudentV1("Peter Parker");
    }
    
    @GetMapping(value = "/student/header",headers = "API-VERSION=2")
    StudentV2 getPersonHeader2() {
        return new StudentV2(new Name("Peter","Parker"));
    }
    
    @GetMapping("/postList")
    public List<Post> getPostList(){
        RestTemplate restTemplate = new RestTemplate();
        String url="https://jsonplaceholder.typicode.com/posts";
        ResponseEntity<List<Post>> response = restTemplate
                .exchange(url, HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<Post>>(){});
        return response.getBody();
    }
    
    @PostMapping("/createPost")
    public ResponseEntity<Post> createPost(){
        String url="https://jsonplaceholder.typicode.com/posts";
        RestTemplate restTemplate= new RestTemplate();
        HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.add("Content-type","application/json; charset=UTF-8");
        HttpEntity<Post> request=new HttpEntity<>(new Post(10050L,10400L,"title1","description1"),httpHeaders);
        Post post=restTemplate.postForObject(url,request,Post.class);
        return new ResponseEntity<Post>(post, HttpStatus.CREATED);
    }

    @PutMapping("/updatePost")
    public ResponseEntity<Post> updatePost(){
        String url="https://jsonplaceholder.typicode.com/posts/1";
        RestTemplate restTemplate= new RestTemplate();
        HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.add("Content-type","application/json; charset=UTF-8");
        HttpEntity<Post> request=new HttpEntity<>(new Post(1L,100L,"title1","description1"),httpHeaders);
        return restTemplate.exchange(url,HttpMethod.PUT,request,Post.class);
    }

    @DeleteMapping("/deletePost")
    public void deletePost(){
        String url="https://jsonplaceholder.typicode.com/posts/1";
        RestTemplate restTemplate= new RestTemplate();
        HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.add("Content-type","application/json; charset=UTF-8");
        HttpEntity<Post> request=new HttpEntity<>(httpHeaders);
        restTemplate.exchange(url, HttpMethod.DELETE,request,Post.class);
    }
    
}
