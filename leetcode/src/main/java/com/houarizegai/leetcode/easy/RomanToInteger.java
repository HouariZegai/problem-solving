package com.houarizegai.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("III") == 3);
        System.out.println(new RomanToInteger().romanToInt("LVIII") == 58);
        System.out.println(new RomanToInteger().romanToInt("MCMXCIV") == 1994);
    }

    private static final Map<Character, Integer> ROMAN_INT_VALUE;

    static {
        ROMAN_INT_VALUE = new HashMap<>();
        ROMAN_INT_VALUE.put('I', 1);
        ROMAN_INT_VALUE.put('V', 5);
        ROMAN_INT_VALUE.put('X', 10);
        ROMAN_INT_VALUE.put('L', 50);
        ROMAN_INT_VALUE.put('C', 100);
        ROMAN_INT_VALUE.put('D', 500);
        ROMAN_INT_VALUE.put('M', 1000);
    }

    public int romanToInt(String s) {
        s = new StringBuilder(s).reverse().toString();
        int out = 0;

        for(int i = 0; i < s.length(); i++) {
            final char ch = s.charAt(i);

            if(ch != 'I' && i != s.length() - 1) {
                final char next = s.charAt(i + 1);
                if((ch == 'V' || ch == 'X') && next == 'I') {
                    out += ROMAN_INT_VALUE.get(ch);
                    out--;
                    i++;
                    continue;
                } else if((ch == 'L' || ch == 'C') && next == 'X') {
                    out += ROMAN_INT_VALUE.get(ch);
                    out -= 10;
                    i++;
                    continue;
                } else if((ch == 'D' || ch == 'M') && next == 'C') {
                    out += ROMAN_INT_VALUE.get(ch);
                    out -= 100;
                    i++;
                    continue;
                }
            }
            out += ROMAN_INT_VALUE.get(ch);
        }

        return out;
    }
}
