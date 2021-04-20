package com.example.demo.configurations;

import com.example.demo.people.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class InstructorConfig {

    @Bean
    public Instructors tcUsaInstructors() {
        return new Instructors();
    }

    @Bean
    public Instructors tcUkInstructors() {
        return new Instructors();
    }

    @Bean
    @Primary
    public Instructors instructors() {
        return new Instructors();
    }
}
