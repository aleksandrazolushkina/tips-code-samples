package com.jetbrains.samples;

import java.util.stream.IntStream;

@SuppressWarnings({"unused", "ResultOfMethodCallIgnored", "SameParameterValue"})
public class CompletionSort {
    private void ParameterHints() {
    }

    private String[] getWordsInSentence(String sentence) {
        return sentence.split("\\s");
    }

    public void startUserService() {
        new Service("/users/", 8080);
    }

    public Customer findCustomerByName(String name) {
        return findCustomer(name, null, null, 0, true);
    }

    public void noParamNames() {
        IntStream.range(10, 100);
        IntStream.of(1);
    }

 /*   SCREENSHOT FOR TIPS HERE*/

    public void shortParameterNames() {
        Service.genea
    }





    private Customer findCustomer(String name, String address, Integer orderNumber, int id, boolean ascending) {
        return null;
    }

    private static class Service implements Runnable {
        public Service(String path, int port) {
            String s = "Hello,\n\rworld\n!\n";
        }

        public void run() {

        }

        static String generateServiceName(String n) {
            return null;
        }
    }

    private enum State {
        STOPPED(1),
        RUNNING(2),
        PAUSED(3);

        private int code;

        State(int code) {
            this.code = code;
        }
    }
}

}
