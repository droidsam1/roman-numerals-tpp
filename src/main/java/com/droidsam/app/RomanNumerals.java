package com.droidsam.app;

public class RomanNumerals {
    public static String convertFromArabicNumber(int arabicNumber) {


        if (arabicNumber == 9) {
            return "IX";
        }

        if (arabicNumber == 4) {
            return "IV";
        }

        if (arabicNumber >= 5) {
            return "V" + "I".repeat(arabicNumber - 5);
        }


        return "I".repeat(arabicNumber);
    }
}
