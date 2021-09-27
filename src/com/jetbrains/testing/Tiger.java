package com.jetbrains.testing;

public class Tiger implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz...");
    }
}
