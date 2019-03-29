package com.springthymeleaf.thymeleaf.controller;

import com.springthymeleaf.thymeleaf.model.Employee;
import com.springthymeleaf.thymeleaf.model.FormData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequestMapping("/")
@Controller
public class HomeController {
    
    List<Employee> employeeList = new ArrayList<>();
    @GetMapping("sayHello")
    public String sayHello() {
        return "hello";
    }
    
    @PostMapping("register")
    public ModelAndView getUser(Employee employee) throws InterruptedException{
        employeeList.add(employee);
       return new ModelAndView("registered").addObject(employeeList);
    }
    
    @GetMapping("formRegister")
    public ModelAndView form(){
        ModelAndView modelAndView = new ModelAndView("formRegister");
        modelAndView.addObject("employee",new Employee());
        return modelAndView;
    }
    
    @GetMapping("showtime")
    public String showtime(){
        return "showtime";
    }
    
    @GetMapping("time")
    @ResponseBody
    public String timeData(){
        return new Date().toString();
    }
    
    
//    Question10
    @GetMapping("formcheck")
    public ModelAndView formcheck(){
        return new ModelAndView("form-loader-ex").addObject(new FormData());
    }
    
    @PostMapping("formdatacheck")
    public String formdatacheck() throws InterruptedException{
        Thread.sleep(5000L);
        return "registered-check";
    }
}
