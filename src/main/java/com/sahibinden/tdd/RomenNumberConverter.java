package com.sahibinden.tdd;

public class RomenNumberConverter
{
    public String convert(int number)
    {
        if (number >= 50 ) {
            return appendAdditive(number, 50,  "L", "I");
        }

        if (number >= 10 ) {
            return appendAdditive(number, 10,  "X", "I");
        }

        if (number >= 5 ) {
            return appendAdditive(number, 5, "V", "I");
        }

        if (number >= 1) {
            return appendAdditive(number, 0, "", "I");
        }
        return "";
    }

    private String appendAdditive(int number, int start, String prefix, String suffix)
    {
        StringBuilder sb = new StringBuilder(prefix);
        for(int i = start; i < number; i++)
        {
            sb.append(suffix);
        }
        return sb.toString();
    }
}
