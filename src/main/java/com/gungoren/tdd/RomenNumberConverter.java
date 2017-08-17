package com.gungoren.tdd;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RomenNumberConverter
{
    private final static HashMap<Integer, String> romenMap;
    private final static HashMap<Integer, Integer> chipperMap;
    private DigitParser digitParser = new DigitParser();

    static {
        romenMap = new LinkedHashMap<Integer, String>();
        romenMap.put(1000, "M");
        romenMap.put(500, "D");
        romenMap.put(100, "C");
        romenMap.put(50, "L");
        romenMap.put(10, "X");
        romenMap.put(5, "V");
        romenMap.put(1, "I");
        romenMap.put(0, "");

        chipperMap = new LinkedHashMap<Integer, Integer>();
        chipperMap.put(1000, 100);
        chipperMap.put(500, 100);
        chipperMap.put(100, 10);
        chipperMap.put(50, 10);
        chipperMap.put(10, 1);
        chipperMap.put(5, 1);
        chipperMap.put(1, 1);
    }

    public String convert(int number)
    {

        if (number < 1 || number > 3999)
            throw new RomenNumberException("number is out of range, valid range [1, 3999]");
        List<Integer> digits = digitParser.parse(number);
        StringBuilder sb = new StringBuilder();
        for(Integer digit: digits)
        {
            String key = convertToRomenNumber(digit);
            sb.append(key);
        }
        return sb.toString();
    }

    private String convertToRomenNumber(int number)
    {
        if (romenMap.containsKey(number))
            return romenMap.get(number);

        for(Map.Entry<Integer, String> entry: romenMap.entrySet())
        {
            int key = entry.getKey();
            String value = entry.getValue();
            Integer chipper = chipperMap.get(key);
            if (key == number + chipper) {
                return appendPrefix(value, romenMap.get(chipper));
            }else if (number % key == 0) {
                return appendSuffix(number, key, value, key, romenMap.get(key));
            }else if (number > key) {
                return appendSuffix(number, key, value, chipper, romenMap.get(chipper));
            }
        }
        return "";
    }

    private String appendPrefix(String suffix, String prefix)
    {
        return prefix + suffix;
    }

    private String appendSuffix(int number, int digit, String prefix, int chipper, String suffix)
    {
        StringBuilder sb = new StringBuilder(prefix);
        for(int i = 0; i < (number - digit) / chipper; i++)
        {
            sb.append(suffix);
        }
        return sb.toString();
    }
}
