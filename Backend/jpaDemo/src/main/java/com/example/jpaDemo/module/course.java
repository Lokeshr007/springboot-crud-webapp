package com.example.jpaDemo.module;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class course {
    @Id
    private String courseId;
    private String courseName;
    private String trainer;
    private int durationInweeks;
}
