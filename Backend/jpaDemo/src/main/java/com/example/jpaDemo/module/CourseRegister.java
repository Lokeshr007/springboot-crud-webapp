package com.example.jpaDemo.module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.generator.values.internal.GeneratedValuesImpl;

@Entity
@Data
@NoArgsConstructor
public class CourseRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String emailId;
    private String courseName;


    public CourseRegister(String name, String emailId, String coursename) {
        this.name=name;
        this.emailId=emailId;
        this.courseName=coursename;
    }
}
