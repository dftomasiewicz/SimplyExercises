package com.dft;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature < 25) {
            return false;
        } else if (temperature <= 35) {
            return true;
        } else if (summer == true && temperature <= 45) {
            return true;
        }
        return false;
    }
}
