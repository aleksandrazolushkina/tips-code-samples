package com.jetbrains.testing;

import java.util.Arrays;
import java.util.List;

public class Documentation {

    public void printLines() {
        List<String> lines = Arrays.asList("line_1", "line_2", "line_3");
        lines.forEach(System.out::println);
    }
}
