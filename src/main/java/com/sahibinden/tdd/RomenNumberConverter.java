package com.sahibinden.tdd;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomenNumberConverter
{
    private final static HashMap<Integer, String> romenMap;
    private final static HashMap<Integer, Integer> chipperMap;

    static {
        romenMap = new LinkedHashMap<Integer, String>();
        romenMap.put(100, "C");
        romenMap.put(50, "L");
        romenMap.put(10, "X");
        romenMap.put(5, "V");
        romenMap.put(1, "I");

        chipperMap = new LinkedHashMap<Integer, Integer>();
        chipperMap.put(100, 10);
        chipperMap.put(50, 10);
        chipperMap.put(10, 1);
        chipperMap.put(5, 1);
        chipperMap.put(1, 1);
    }

    public String convert(int number)
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
            }else if (key == number - chipper) {
                return appendSuffix(number, key, value, chipper,  romenMap.get(chipper));
            }else if (number > key) {
                return appendSuffix(number, key, value, 1, "I");
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
