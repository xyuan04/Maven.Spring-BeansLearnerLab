package com.example.demo;

import java.util.Iterator;

public class Instructor extends Person implements Teacher {

    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int count = 0;
        for(Learner learner : learners) {count++;}

        double numberOfHoursPerLearner = numberOfHours / count;

        learners.forEach(learner -> learner.learn(numberOfHoursPerLearner));
    }
}
