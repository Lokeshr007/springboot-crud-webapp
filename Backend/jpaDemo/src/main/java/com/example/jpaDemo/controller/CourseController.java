package com.example.jpaDemo.controller;

import com.example.jpaDemo.module.CourseRegister;
import com.example.jpaDemo.module.course;
import com.example.jpaDemo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://127.0.0.1:5500/")
public class CourseController {
    @Autowired
    CourseService ser;

    @GetMapping("course")
    public List<course> getCourse(){
        return ser.getStudent();
    }

    @GetMapping("/course/{courseId}")
    public course getDet(@PathVariable("courseId") String courseId){
        return ser.getDet(courseId);
    }

    @GetMapping("course/enrolled")
    public List<CourseRegister> getEnrolled(){
        return ser.getEnrolled();
    }

    @PostMapping("course/register")
    public String postReg(@RequestParam("name") String name,@RequestParam("emailId") String emailId,@RequestParam("coursename") String coursename){
         ser.postReg(name,emailId,coursename);
         return "Congratulation "+name+"for Registration";
    }
}
