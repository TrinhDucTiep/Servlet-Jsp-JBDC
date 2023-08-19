package com.example.cc.model;


/*
Conventions of JavaBeans (have to follow):
    + implement Serializable
    + empty constructor
    + attr is private and have getter & setter

    => the other: Pojo: dont have to follow convention, just simply get what you want
 */

import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
