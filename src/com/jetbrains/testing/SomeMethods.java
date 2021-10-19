package com.jetbrains.testing;
import com.jetbrains.service.Person;

public class SomeMethods {

    public void someMethod(){
        String text = "Some text";
        System.out.println(text);
    }

    public void usingPerson(){
        Person person = new Person("John", "Doe");
        System.out.println(person.getGreeting());
        System.out.println("My name is " + person.name + " " + person.surname);
    }

    public void comparison(String actualText){
        final String expectedText = "Hello";
        expectedText.equals(actualText);
    }

    public void comparison(int param1, int param2){
        if(param1 == param2)
            System.out.println("Equals");
        else
            System.out.println("Not equals");
    }
}
