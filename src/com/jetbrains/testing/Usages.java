package com.jetbrains.testing;

public class Usages {

    public void usagesExample(String text){
        System.out.println("text value = " + text);
        int length = text.length();
        if(length >= 10)
            System.out.println(text);
        else
            System.out.println("String has less than 10 symbols");
    }
}
