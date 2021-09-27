package com.jetbrains.testing;

public class Methods {

    boolean checkStringContent(String text) {
        final String standardText = "Hello";
        if (text.equals(standardText))
            return true;
        else if (text.length() == standardText.length())
            return true;
        else
            return false;
    }

    void greet() throws InterruptedException {
        System.out.println("Hello ");
        Thread.sleep(1000);
        System.out.println("World!");
    }

    public void usagesExample(String text){
        System.out.println("text value = " + text);
        int length = text.length();
        if(length >= 10)
            System.out.println(text);
        else
            System.out.println("String has less than 10 symbols");
    }
}
