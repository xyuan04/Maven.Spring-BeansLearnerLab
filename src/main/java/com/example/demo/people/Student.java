package com.example.demo.people;

import com.example.demo.interfaces.Learner;

public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
