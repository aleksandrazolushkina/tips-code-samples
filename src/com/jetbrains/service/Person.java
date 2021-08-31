package com.jetbrains.service;

public class Person {

    static class Data {}

    public String name;

    public String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getGreeting() {
        return "Hello!";
    }
}
