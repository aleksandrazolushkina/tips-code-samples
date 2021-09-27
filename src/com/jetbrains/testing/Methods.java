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
}
