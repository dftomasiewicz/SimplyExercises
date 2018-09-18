package com.dft;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int p1, int p2, int p3) {

        if ((p1 < 10) || (p1 > 1000) || (p2 < 10) || (p2 > 1000) || (p3 < 10) || (p3 > 1000)) {
            return false;
        }

        if ((p1 % 10 == p2 % 10) || (p1 % 10 == p3 % 10) || (p2 % 10 == p3 % 10)) {
            return true;
        }

        return false;


    }

}
