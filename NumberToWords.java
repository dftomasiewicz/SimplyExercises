package com.dft;

public class NumberToWords {

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.print("Invalid Value");
        }

        int reverseNumber = reverse(number);
        while (reverseNumber != 0) {
            int digit = reverseNumber % 10;
            switch (digit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
            reverseNumber /= 10;
        }
        int countDigit = getDigitCount(reverse(number));
        while (countDigit != getDigitCount(number)) {
            System.out.print("Zero ");
            countDigit++;
        }
        System.out.println();
    }

    public static int reverse(int number) {

        int reverseNumber = 0;
        if (number == 0) {
            return 0;
        }
        while (number != 0) {
            int remainder = number % 10;
            reverseNumber *= 10;
            reverseNumber += remainder;
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
