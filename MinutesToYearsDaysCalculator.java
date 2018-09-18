package com.dft;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = (int) minutes / (365 * 24 * 60);
            long remainingDays = (int) minutes % (365 * 24 * 60);
            long days = remainingDays / (24 * 60);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
