package com.gungoren.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DigitParser
{
    public List<Integer> parse(int number) {

        List<Integer> result = new ArrayList<Integer>();
        int digitWeight = 1;
        while (number > 0)
        {
            result.add(number % 10 * digitWeight);
            number /= 10;
            digitWeight *=10;
        }
        Collections.reverse(result);
        return result;
    }
}
