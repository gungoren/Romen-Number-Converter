package com.gungoren.tdd;

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
    public void test_10_20_30() throws Exception
    {
        assertEquals(converter.convert(10), "X");
        assertEquals(converter.convert(20), "XX");
        assertEquals(converter.convert(30), "XXX");
    }

    @Test
    public void test_100_200_300() throws Exception
    {
        assertEquals(converter.convert(100), "C");
        assertEquals(converter.convert(200), "CC");
        assertEquals(converter.convert(300), "CCC");
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
    public void test_49() throws Exception
    {
        assertEquals(converter.convert(49), "XLIX");
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
    }

    @Test
    public void test_1975() throws Exception
    {
        assertEquals(converter.convert(1975), "MCMLXXV");
    }

    @Test
    public void test_3999() throws Exception
    {
        assertEquals(converter.convert(3999), "MMMCMXCIX");
    }

    @Test(expected = RomenNumberException.class)
    public void test_0() throws Exception
    {
        assertEquals(converter.convert(0), "");
    }

    @Test(expected = RomenNumberException.class)
    public void test_4000() throws Exception
    {
        assertEquals(converter.convert(4000), "");
    }
}
