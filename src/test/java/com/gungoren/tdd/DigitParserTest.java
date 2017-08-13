package com.gungoren.tdd;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DigitParserTest
{
    private DigitParser digitParser;

    @Before
    public void setUp() throws Exception
    {
        digitParser = new DigitParser();
    }

    @Test
    public void test_1_2_3_9()
    {
        assertEquals(digitParser.parse(1), Arrays.asList(1));
        assertEquals(digitParser.parse(2), Arrays.asList(2));
        assertEquals(digitParser.parse(3), Arrays.asList(3));
        assertEquals(digitParser.parse(9), Arrays.asList(9));
    }

    @Test
    public void test_10_11_12_19()
    {
        assertEquals(digitParser.parse(10), Arrays.asList(10, 0));
        assertEquals(digitParser.parse(11), Arrays.asList(10, 1));
        assertEquals(digitParser.parse(12), Arrays.asList(10, 2));
        assertEquals(digitParser.parse(19), Arrays.asList(10, 9));
    }

    @Test
    public void test_83()
    {
        assertEquals(digitParser.parse(83), Arrays.asList(80, 3));
    }
}
