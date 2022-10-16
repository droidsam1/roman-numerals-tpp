package com.droidsam.app;

public class RomanNumerals {
    public static String convertFromArabicNumber(int arabicNumber) {

        if (arabicNumber >= 40) {
            return "XL" + convertFromArabicNumber(arabicNumber - 40);
        }

        if (arabicNumber >= 10) {
            return "X" + convertFromArabicNumber(arabicNumber - 10);
        }

        if (arabicNumber >= 9) {
            return "IX" + convertFromArabicNumber(arabicNumber - 9);
        }

        if (arabicNumber >= 5) {
            return "V" + convertFromArabicNumber(arabicNumber - 5);
        }

        if (arabicNumber >= 4) {
            return "IV" + convertFromArabicNumber(arabicNumber - 4);
        }

        return "I".repeat(arabicNumber);
    }
}
