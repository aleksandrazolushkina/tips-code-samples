package com.jetbrains.samples;

public class RegexChecker {
    public boolean verifyPhoneNumber(String number) {
        if (number != null) {
            return number.matches("[0-9]{3}-[0-9]{4}");
        }
        return false;
    }
}
