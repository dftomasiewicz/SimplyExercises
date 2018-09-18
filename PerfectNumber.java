package com.dft;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sumOfDivisor = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDivisor += i;
            }
        }

        if (sumOfDivisor == number) {
            return true;
        }
        return false;
    }
}
