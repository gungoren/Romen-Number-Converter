package com.sahibinden.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
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
    public void test_4() throws Exception
    {
        assertEquals(converter.convert(4), "IV");
    }

    @Test
    public void test_9() throws Exception
    {
        assertEquals(converter.convert(9), "IX");
    }

    @Test
    public void test_50_51_52_53() throws Exception
    {
        assertEquals(converter.convert(50), "L");
        assertEquals(converter.convert(51), "LI");
        assertEquals(converter.convert(52), "LII");
        assertEquals(converter.convert(53), "LIII");
    }

    @Test
    @Ignore
    public void test_49() throws Exception
    {
        assertEquals(converter.convert(49), "XLI");
    }

    @Test
    public void test_40() throws Exception
    {
        assertEquals(converter.convert(40), "XL");
    }

    @Test
    public void test_90() throws Exception
    {
        assertEquals(converter.convert(90), "XC");
    }

    @Test
    public void test_110_120() throws Exception
    {
        assertEquals(converter.convert(110), "CX");
        assertEquals(converter.convert(120), "CXX");
    }

    @Test
    public void test_100_1_2_3() throws Exception
    {
        int start = 100;
        assertEquals(converter.convert(start++), "C");
        assertEquals(converter.convert(start++), "CI");
        assertEquals(converter.convert(start++), "CII");
        assertEquals(converter.convert(start++), "CIII");

        /*start = 500;
        assertEquals(converter.convert(start++), "D");
        assertEquals(converter.convert(start++), "DI");
        assertEquals(converter.convert(start++), "DII");
        assertEquals(converter.convert(start++), "DIII");

        start = 1000;
        assertEquals(converter.convert(start++), "M");
        assertEquals(converter.convert(start++), "MI");
        assertEquals(converter.convert(start++), "MII");
        assertEquals(converter.convert(start++), "MIII");
        */
    }
}
