package com.droidsam.app;

public class RomanNumerals {
    public static String convertFromArabicNumber(int arabicNumber) {
        if(arabicNumber>=5){
            return "V";
        }

        if(arabicNumber == 4){
            return "IV";
        }
        return "I".repeat(arabicNumber);
    }
}
