package com.sahibinden.tdd;

public class RomenNumberConverter
{
    public String convert(int number)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < number; i++)
        {
            sb.append("I");
        }
        return sb.toString();
    }
}
