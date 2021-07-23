package com.jetbrains.testing;

public class SomeData {

    // created for highlighting methods
    private static Methods methods = new Methods();

    private void methodForUsing(){
        Cat oleg = new Cat();
        boolean result1 = methods.checkStringContent("Ciao");
        boolean result2 = methods.checkStringContent("Cacao");
        try {
            methods.greet();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Selection().print();
        new SomeMethods().usingPerson();
        new SomeMethods().someMethod();
    }
}
