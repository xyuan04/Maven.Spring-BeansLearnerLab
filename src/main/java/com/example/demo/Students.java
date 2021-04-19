package com.example.demo;

import java.util.Arrays;
import java.util.Iterator;

public class Students extends People<Student> {

    public Students(Student... students) {
        this.findAll().addAll(Arrays.asList(students));
    }

    @Override
    public Iterator<Student> iterator() {
        return this.findAll().iterator();
    }
}
