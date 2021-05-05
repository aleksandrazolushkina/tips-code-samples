package com.jetbrains.samples;

import java.util.regex.Pattern;

public class RegExSample {
    Pattern PATTERN = Pattern.compile("[A-Za-z0-9.%-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{3,4}");
}
