package com.droidsam.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {

    @Test
    public void shouldConvertOneToI() {
        Assertions.assertEquals("I", RomanNumerals.convertFromArabicNumber(1));
    }
}
