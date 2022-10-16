package com.droidsam.app;

public class RomanNumerals {
    public static String convertFromArabicNumber(int arabicNumber) {

        if (arabicNumber == 40) {
            return "XL";
        }

        if (arabicNumber >= 10) {
            return "X" + convertFromArabicNumber(arabicNumber - 10);
        }

        if (arabicNumber == 9) {
            return "IX";
        }

        if (arabicNumber >= 5) {
            return "V" + "I".repeat(arabicNumber - 5);
        }

        if (arabicNumber == 4) {
            return "IV";
        }

        return "I".repeat(arabicNumber);
    }
}
