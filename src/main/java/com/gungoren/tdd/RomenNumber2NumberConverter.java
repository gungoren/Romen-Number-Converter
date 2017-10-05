package com.gungoren.tdd;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class RomenNumber2NumberConverter
{
    private final static HashMap<String, Integer> romenMap;
    private final static HashMap<String, String> chipperMap;

    static {
        romenMap = new LinkedHashMap<String, Integer>();
        romenMap.put("M", 1000);
        romenMap.put("D", 500);
        romenMap.put("C", 100);
        romenMap.put("L", 50);
        romenMap.put("X", 10);
        romenMap.put("V", 5);
        romenMap.put("I", 1);
        romenMap.put("", 0);

        chipperMap = new LinkedHashMap<String, String>();
        chipperMap.put("M", "C");
        chipperMap.put("D", "C");
        chipperMap.put("C", "X");
        chipperMap.put("L", "X");
        chipperMap.put("X", "I");
        chipperMap.put("V", "I");
        chipperMap.put("I", "");
    }

    public int convert(String romenNumber)
    {
        if (romenNumber.length() == 0)
            throw new RomenNumberException("parameter is empty");

        int number = 0;
        String previous = "";
        for(int i = 0; i < romenNumber.length(); i++)
        {
            String current = String.valueOf(romenNumber.charAt(i));
            Integer value = romenMap.get(current);

            if (value == null)
                throw new RomenNumberException("unexpected romen number : " + current);

            number += value;

            String chipper = chipperMap.get(current);
            Integer previousValue = romenMap.get(previous);
            if (chipper.equals(previous))
            {
                number -= 2 * previousValue;
            } else if (previousValue != 0 && value > previousValue)
            {
                throw new RomenNumberException("invalid romen number");
            }
            previous = current;
        }
        return number;
    }
}
