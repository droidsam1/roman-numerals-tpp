package com.droidsam.app;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {
    public static String convertFromArabicNumber(int arabicNumber) {

        Map<Integer, String> representations = new LinkedHashMap<>();
        representations.put(40, "XL");
        representations.put(10, "X");
        representations.put(9, "IX");
        representations.put(5, "V");
        representations.put(4, "IV");


        for (Map.Entry<Integer, String> entry : representations.entrySet()) {
            if (arabicNumber >= entry.getKey()) {
                return entry.getValue() + convertFromArabicNumber(arabicNumber - entry.getKey());
            }
        }

        return "I".repeat(arabicNumber);
    }
}
