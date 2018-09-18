package com.dft;

public class SharedDigit {

    public static boolean hasSharedDigit(int p1, int p2) {
        if ((p1 < 10) || (p1 > 99) || (p2 < 10) || (p2 > 99)) {
            return false;
        }

        int digitP1 = 0;
        int digitP2 = 0;
        while (p1 > 0) {
            digitP1 = p1 % 10;
            p1 /= 10;
            while (p2 > 0) {
                digitP2 = p2 % 10;
                if (digitP1 == digitP2) {
                    return true;
                }
                p2 /= 10;
            }
        }
        return false;
    }
}
