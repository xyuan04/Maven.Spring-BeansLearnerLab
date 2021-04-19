package com.example.demo;

import java.util.Arrays;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType>{
    private List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public People(PersonType... person) {
        personList.addAll(Arrays.asList(person));
    }

    public void add(PersonType person) {
        personList.add(person);
    }

    public void remove(PersonType person) {
        personList.removeIf(person::equals);
    }

    public int size() {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public void addAll(Iterable<PersonType> persons) {
        persons.forEach(personType -> personList.add(personType));
    }

    public PersonType findById(Long id) {
        for(PersonType person : personList) {
            if(person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public List<PersonType> findAll() {
        return personList;
    }
}
