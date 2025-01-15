package com.github.bgrebennikovv;

public class Main {
    public static void main(String[] args) {

        // Task 1

        int year = 2024;
        if (isLeapYear(year)) {
            System.out.printf("%s год - високосный год", year);
        } else {
            System.out.printf("%s год - невисокосный год", year);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }



}