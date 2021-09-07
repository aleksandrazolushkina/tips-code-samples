package com.jetbrains.testing;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletionExamples {

    private BufferedOutputStream

    public void smartType() {
        BufferedReader br;
        br = new BufferedReader();
    }

    public void toArrayCompletion() {
        List<String> strings = new ArrayList();
        String[] p =
    }

    public void toListCompletion() {
        String[] strings = {"one", "two", "three"};
        List<String> list =
    }

    public void gettingValueCompletion() {
        boolean[] values;
        boolean value =
    }

    public void exceptionCompletion(String value) {
        try {
            int x = Integer.parseInt(value);
        } catch (NumberFormatException nfe) {
            if ()
        }
    }

    public void smartTypeCompletion() {
        List list =
    }

    public void postfixCompletion() {
        System.out.println()
    }

    public void codeCompletion() {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future f = service
    }

    public void liveTemplate(){
        List<String> list = new ArrayList<>();
        list.
    }
}
