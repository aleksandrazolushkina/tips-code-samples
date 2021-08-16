package com.jetbrains.inheritance;

abstract class Animal {

    private String name;

    private String type;

    Animal(String name, String type){
        this.name = name;
        this.type = type;
    }

    public void greet(){
        System.out.println("Hello from fauna");
    }

    abstract void eat();
}
