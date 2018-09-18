package com.dft;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double p1, double p2) {
        if ((int) (p1 * 1000) == (int) (p2 * 1000)) {
            return true;
        }
        return false;
    }
}
