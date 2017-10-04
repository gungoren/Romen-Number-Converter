package com.gungoren.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomenNumber2NumberConverterTest
{
    private RomenNumber2NumberConverter converter;

    @Before
    public void setUp() throws Exception
    {
        converter = new RomenNumber2NumberConverter();
    }

    @Test
    public void test_1_2_3() throws Exception
    {
        assertEquals(converter.convert( "I"), 1);
        assertEquals(converter.convert("II"), 2);
        assertEquals(converter.convert( "III"),3);
    }

    @Test
    public void test_5_6_7_8() throws Exception
    {
        assertEquals(converter.convert( "V"), 5);
        assertEquals(converter.convert( "VI"), 6);
        assertEquals(converter.convert("VII"), 7);
        assertEquals(converter.convert("VIII"), 8);
    }

    @Test
    public void test_10_11_12_13() throws Exception
    {
        assertEquals(converter.convert("X"), 10);
        assertEquals(converter.convert( "XI"), 11);
        assertEquals(converter.convert( "XII"), 12);
        assertEquals(converter.convert( "XIII"), 13);
    }

    @Test
    public void test_10_20_30() throws Exception
    {
        assertEquals(converter.convert("X"), 10);
        assertEquals(converter.convert("XX"), 20);
        assertEquals(converter.convert( "XXX"), 30);
    }

    @Test
    public void test_100_200_300() throws Exception
    {
        assertEquals(converter.convert("C"), 100);
        assertEquals(converter.convert("CC"), 200);
        assertEquals(converter.convert("CCC"), 300);
    }

    @Test
    public void test_4() throws Exception
    {
        assertEquals(converter.convert( "IV"), 4);
    }

    @Test
    public void test_9() throws Exception
    {
        assertEquals(converter.convert( "IX"), 9);
    }

    @Test
    public void test_50_51_52_53() throws Exception
    {
        assertEquals(converter.convert("L"), 50);
        assertEquals(converter.convert("LI"), 51);
        assertEquals(converter.convert("LII"), 52);
        assertEquals(converter.convert("LIII"), 53);
    }

    @Test
    public void test_49() throws Exception
    {
        assertEquals(converter.convert( "XLIX"), 49);
    }

    @Test
    public void test_40() throws Exception
    {
        assertEquals(converter.convert("XL"), 40);
    }

    @Test
    public void test_90() throws Exception
    {
        assertEquals(converter.convert( "XC"), 90);
    }

    @Test
    public void test_110_120() throws Exception
    {
        assertEquals(converter.convert( "CX"), 110);
        assertEquals(converter.convert("CXX"), 120);
        assertEquals(converter.convert("CXXX"), 130);
    }

    @Test
    public void test_100_1_2_3() throws Exception
    {
        int start = 100;
        assertEquals(converter.convert( "C"), start++);
        assertEquals(converter.convert( "CI"), start++);
        assertEquals(converter.convert( "CII"), start++);
        assertEquals(converter.convert( "CIII"), start++);
    }

    @Test
    public void test_1975() throws Exception
    {
        assertEquals(converter.convert("MCMLXXV"), 1975);
    }

    @Test
    public void test_3999() throws Exception
    {
        assertEquals(converter.convert("MMMCMXCIX"), 3999);
    }

    @Test(expected = RomenNumberException.class)
    public void test_0() throws Exception
    {
        assertEquals(converter.convert( ""), 0);
    }

    @Test(expected = RomenNumberException.class)
    public void test_exception() throws Exception
    {
        assertEquals(converter.convert( "MEHMET"), 0);
    }

    @Test(expected = RomenNumberException.class)
    public void test_invalid() throws Exception
    {
        assertEquals(converter.convert( "ILCX"), 0);
    }
}
