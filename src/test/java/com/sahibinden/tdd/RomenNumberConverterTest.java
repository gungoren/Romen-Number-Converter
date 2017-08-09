package com.sahibinden.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomenNumberConverterTest
{
    private RomenNumberConverter converter;

    @Before
    public void setUp() throws Exception
    {
        converter = new RomenNumberConverter();
    }

    @Test
    public void test_1_2_3() throws Exception
    {
        assertEquals(converter.convert(1), "I");
        assertEquals(converter.convert(2), "II");
        assertEquals(converter.convert(3), "III");
    }

    @Test
    public void test_5_6_7_8() throws Exception
    {
        assertEquals(converter.convert(5), "V");
        assertEquals(converter.convert(6), "VI");
        assertEquals(converter.convert(7), "VII");
        assertEquals(converter.convert(8), "VIII");
    }

    @Test
    public void test_10_11_12_13() throws Exception
    {
        assertEquals(converter.convert(10), "X");
        assertEquals(converter.convert(11), "XI");
        assertEquals(converter.convert(12), "XII");
        assertEquals(converter.convert(13), "XIII");
    }

    @Test
    public void test_50_51_52_53() throws Exception
    {
        assertEquals(converter.convert(50), "L");
        assertEquals(converter.convert(51), "LI");
        assertEquals(converter.convert(52), "LII");
        assertEquals(converter.convert(53), "LIII");
    }
}
