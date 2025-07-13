package com.example.jpaDemo.repository;

import com.example.jpaDemo.module.CourseRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courseregisterrepo extends JpaRepository<CourseRegister,Integer> {

}
