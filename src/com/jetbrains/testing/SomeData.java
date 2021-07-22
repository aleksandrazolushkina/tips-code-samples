package com.jetbrains.testing;

public class SomeData {

    // created for highlighting methods
    private static Methods methods = new Methods();

    private void useCatObject() {
        Cat oleg = new Cat();
    }

    private void useStringContentCheck() {
        boolean result1 = methods.checkStringContent("Ciao");
        boolean result2 = methods.checkStringContent("Cacao");
    }

    private void useGreetMethod(){
        try {
            methods.greet();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void selectionUsing(){
        new Selection().print();
    }
}
