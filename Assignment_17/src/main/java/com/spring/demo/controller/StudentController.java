package com.spring.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

//Question1
public class StudentController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}

//Question2
//public class StudentController extends MultiActionController{
//
//    public ModelAndView action1(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
//        ModelAndView modelAndView = new ModelAndView("index");
//        return modelAndView;
//    }
//
//    public void action2(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception{
//            httpServletResponse.setContentType("text/html");
//            httpServletResponse.getWriter().println("<b> Hello There </b>");
//        }
//}

//Question3
//@Controller
//public class StudentController extends MultiActionController{
//    @RequestMapping("/index")
//    public ModelAndView action1(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
//        ModelAndView modelAndView = new ModelAndView("example");
//        return modelAndView;
//    }
//
//    public void action2(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception{
//        httpServletResponse.setContentType("text/html");
//        httpServletResponse.getWriter().println("<b> Hello There </b>");
//    }
//}

//Question4
//@Controller
//public class StudentController extends MultiActionController{
//
//    @RequestMapping("/hello")
//    @ResponseBody
//    public String display(){
//        return "Hello World";
//    }
//    public ModelAndView action1(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
//        ModelAndView modelAndView = new ModelAndView("index");
//        return modelAndView;
//    }
//
//    public void action2(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception{
//        httpServletResponse.setContentType("text/html");
//        httpServletResponse.getWriter().println("<b> Hello There </b>");
//    }
//}

////Question5
//@Controller
//public class StudentController extends MultiActionController{
//    @RequestMapping("/sendModel")
//    public ModelAndView sendModel(){
//        return new ModelAndView("example");
//    }
//
//}

//Question6
//@Controller
//public class StudentController extends MultiActionController{
//    @RequestMapping("/name/{firstname}/{lastname}")
//    @ResponseBody
//    public String sendModel(@PathVariable("firstname") String fname , @PathVariable("lastname") String lname){
//        return "FirstName " + fname + " LastName "+ lname;
//    }
//
//}

////Question7
//@Controller
//public class StudentController extends MultiActionController{
//    @RequestMapping("/name/{firstname}/{lastname}")
//    @ResponseBody
//    public String sendModel(@PathVariable Map<String,String> requestData){
//        return "FirstName " + requestData.get("firstname") + " LastName "+requestData.get("lastname");
//    }
//
//}

//
////Question8
//@Controller
//@RequestMapping("/student")
//public class StudentController extends MultiActionController{
//    @RequestMapping("/form")
//    @ResponseBody
//    public String formData(@RequestParam("fname") String fname, @RequestParam("lname") String lname){
//                return "FirstName " + fname + " LastName "+ lname;
//    }
//}

//Question9
//@Controller
//@RequestMapping("/student")
//public class StudentController extends MultiActionController{
//    @RequestMapping("/form")
//    @ResponseBody
//    public String formData(User user){
//        return "FirstName " + user.getFname() + " LastName "+ user.getLname();
//    }
//}

//Question10
//@Controller
//@RequestMapping("/student")
//public class StudentController extends MultiActionController{
//    @RequestMapping("/form")
//    @ResponseBody
//    public String formData(User user){
//        return "FirstName " + user.getFname() + " LastName "+ user.getLname();
//    }
//}

////Question11
//@Controller
//@RequestMapping("/student")
//public class StudentController extends MultiActionController{
//
//    @ModelAttribute
//    void addData(Model model)
//    {
//        model.addAttribute("heading","spring mvc demo");
//    }
//
//    @RequestMapping("/form")
//    @ResponseBody
//    public ModelAndView formData(@ModelAttribute("user") User user){
//        return new ModelAndView("submittedFormData");
//    }
//}
