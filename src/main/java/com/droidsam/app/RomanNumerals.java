package com.droidsam.app;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {
    public static String convertFromArabicNumber(int arabicNumber) {

        Map<Integer, String> dictionary = new LinkedHashMap<>();
        dictionary.put(40, "XL");
        dictionary.put(10, "X");
        dictionary.put(9, "IX");
        dictionary.put(5, "V");
        dictionary.put(4, "IV");
        dictionary.put(1, "I");

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Integer, String> arabicToRomanEntry : dictionary.entrySet()) {
            while (arabicNumber >= arabicToRomanEntry.getKey()) {
                result.append(arabicToRomanEntry.getValue());
                arabicNumber -= arabicToRomanEntry.getKey();
            }
        }
        return result.toString();
    }
}
