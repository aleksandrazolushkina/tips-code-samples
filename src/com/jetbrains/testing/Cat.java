package com.jetbrains.testing;

public class Cat implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz...");
    }
}
