package com.sahibinden.tdd;

public class RomenNumberConverter
{
    public String convert(int number)
    {
        if (number >= 1000 ) {
            return appendAdditive( 1000,  number,"M", "I");
        }

        if (number >= 500 ) {
            return appendAdditive( 500,  number,"D", "I");
        }

        if (number >= 100 ) {
            return appendAdditive( 100,  number,"C", "I");
        }

        if (number >= 50 ) {
            return appendAdditive( 50,  number,"L", "I");
        }

        if (number >= 10 ) {
            return appendAdditive(10, number,  "X", "I");
        }

        if (number >= 5 ) {
            return appendAdditive(5, number,"V", "I");
        }

        if (number >= 1) {
            return appendAdditive(0, number, "", "I");
        }
        return "";
    }

    private String appendAdditive(int start, int number, String prefix, String suffix)
    {
        StringBuilder sb = new StringBuilder(prefix);
        for(int i = start; i < number; i++)
        {
            sb.append(suffix);
        }
        return sb.toString();
    }
}
