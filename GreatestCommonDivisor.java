package com.dft;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        if (first <= second) {
            for (int i = first; i > 0; i--) {
                if ((first % i == 0) && (second % i == 0)) {
                    return i;
                }
            }
        }
        for (int i = second; i > 0; i--) {
            if ((second % i == 0) && (first % i == 0)) {
                return i;
            }
        }
        return -1;
    }


    public static int getGreatestCommonDivisor2(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int min = first < second ? first : second;
        int commonDivisor = 1;
        for (int i = 2; i <= min; i++) {
            if ((first % i == 0) && (second % i == 0)) {
                commonDivisor = i;
            }
        }
        return commonDivisor;
    }
}
