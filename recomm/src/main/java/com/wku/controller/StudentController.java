package com.wku.controller;

import com.wku.domain.Student;
import com.wku.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("/student")
@Controller
public class StudentController {


    @Autowired
    private StudentService studentService;

    @RequestMapping("/login")
    public ModelAndView login(@RequestBody Student student){

        ModelAndView modelAndView = new ModelAndView();
        Student result = studentService.login(student.getName(),student.getPassword());
        //设置模型对象
        modelAndView.addObject("student", result);
        //设置视图
        modelAndView.setViewName("success");
        return modelAndView;
    }
}
