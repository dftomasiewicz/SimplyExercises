package com.dft;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reverseNumber = 0;
        int num = number;

        if (number >= 0) {
            while (num > 0) {
                int lastDigit = num % 10;
                reverseNumber *= 10;
                reverseNumber += lastDigit;
                num /= 10;
            }
        } else {
            while (num < 0) {
                int lastDigit = num % 10;
                reverseNumber *= 10;
                reverseNumber += lastDigit;
                num /= 10;
            }
        }

        if (number == reverseNumber) {
            return true;
        }

        return false;
    }
}
