package com.example.jpaDemo.repository;

import com.example.jpaDemo.module.course;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface CourseRepo extends JpaRepository<course,String> {

}
