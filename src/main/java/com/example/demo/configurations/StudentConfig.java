package com.example.demo.configurations;

import com.example.demo.people.Students;
import org.springframework.context.annotation.Bean;

public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        return new Students();
    }

    @Bean(name = "prevStudents")
    public Students previousStudents() {
        return new Students();
    }
}
