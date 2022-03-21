package com.wku.controller;

import com.wku.domain.Student;
import com.wku.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestMapping("/student")
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    public void setStudentService(StudentService studentService){
        this.studentService = studentService;
    }
    
    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        ModelAndView modelAndView = new ModelAndView();
        Student student = studentService.login(name,password);
        //设置模型对象
        modelAndView.addObject("student",student);
        //设置视图
        System.out.println(student.getName());
        modelAndView.setViewName("success");
        return modelAndView;
    }
}
