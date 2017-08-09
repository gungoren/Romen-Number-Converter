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
}
