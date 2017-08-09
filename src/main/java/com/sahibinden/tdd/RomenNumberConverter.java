package com.sahibinden.tdd;

public class RomenNumberConverter
{
    public String convert(int number)
    {
        if (number >= 10 ) {
            StringBuilder sb = new StringBuilder("X");
            for(int i = 10; i < number; i++)
            {
                sb.append("I");
            }
            return sb.toString();
        }

        if (number >= 5 ) {
            StringBuilder sb = new StringBuilder("V");
            for(int i = 5; i < number; i++)
            {
                sb.append("I");
            }
            return sb.toString();
        }

        if (number > 1) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < number; i++)
            {
                sb.append("I");
            }
            return sb.toString();
        }
        return "I";
    }
}
