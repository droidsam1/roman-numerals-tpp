package com.droidsam.app;

public class RomanNumerals {
    public static String convertFromArabicNumber(int arabicNumber) {

        String [] romanRepresentations = new String[10];
        romanRepresentations[4]="IV";
        romanRepresentations[5]="V";
        romanRepresentations[6]="VI";
        romanRepresentations[7]="VII";
        romanRepresentations[8]="VIII";


        if (romanRepresentations[arabicNumber] !=null) {
            return romanRepresentations[arabicNumber];
        }

        return "I".repeat(arabicNumber);
    }
}
