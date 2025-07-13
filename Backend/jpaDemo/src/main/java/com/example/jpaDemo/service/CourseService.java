package com.example.jpaDemo.service;

import com.example.jpaDemo.module.CourseRegister;
import com.example.jpaDemo.module.course;
import com.example.jpaDemo.repository.CourseRepo;
import com.example.jpaDemo.repository.courseregisterrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo rep;

    @Autowired
    courseregisterrepo rep1;

    public List<course> getStudent() {
            return rep.findAll();
    }

    public course getDet( String courseId) {
        return rep.findById(courseId).orElse(null);
    }


    public List<CourseRegister> getEnrolled() {
        return rep1.findAll();
    }

    public void postReg(String name, String emailId, String coursename) {
        rep1.save(new CourseRegister(name,emailId,coursename));
    }
}
