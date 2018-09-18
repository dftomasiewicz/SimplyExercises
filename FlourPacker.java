package com.dft;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int remainderOfGoal = goal % 5;
        if (goal >= bigCount * 5) {
            if ((goal - bigCount * 5) <= smallCount) {
                return true;
            } else {
                return false;
            }
        } else if (goal < bigCount * 5) {
            if ((remainderOfGoal < 5) && (remainderOfGoal <= smallCount)) {
                return true;
            } else {
                return false;
            }
        } else if (goal <= smallCount) {
            return true;
        } else {
            return false;
        }
    }
}
