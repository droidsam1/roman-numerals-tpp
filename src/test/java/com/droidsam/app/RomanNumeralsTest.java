package com.droidsam.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {

    @Test
    public void shouldConvertOneToI() {
        Assertions.assertEquals("I", RomanNumerals.convertFromArabicNumber(1));
    }

    @Test
    public void shouldConvertTwoToII() {
        Assertions.assertEquals("II", RomanNumerals.convertFromArabicNumber(2));
    }

    @Test
    public void shouldConvertThreeToIII() {
        Assertions.assertEquals("III", RomanNumerals.convertFromArabicNumber(3));
    }


    @Test
    public void shouldConvertFourToIV() {
        Assertions.assertEquals("IV", RomanNumerals.convertFromArabicNumber(4));
    }
}
