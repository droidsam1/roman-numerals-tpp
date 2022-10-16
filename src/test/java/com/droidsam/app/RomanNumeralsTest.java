package com.droidsam.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RomanNumeralsTest {

    @ParameterizedTest
    @CsvSource(value = {"1, I", "2,II", "3, III", "4, IV", "5, V", "6, VI", "7, VII", "8, VIII", "9, IX"})
    public void shouldConvertToRoman(Integer arabic, String expectedRepresentation) {
        Assertions.assertEquals(expectedRepresentation, RomanNumerals.convertFromArabicNumber(arabic));
    }

}
