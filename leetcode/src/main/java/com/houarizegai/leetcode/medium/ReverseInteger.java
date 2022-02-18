package com.houarizegai.leetcode.medium;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(123));
    }

    public int reverse(int x) {
        long result = 0;
        int sign = 1;

        if(x < 0) {
            sign = -1;
            x = -x;
        }

        while(x > 0) {
            int mod = x % 10;
            result = result * 10 + mod;
            x /= 10;
        }

        if((Math.pow(-2, 31) > result) || ((Math.pow(2, 31) - 1) < result)) {
            return 0;
        }

        result *= sign;

        return Integer.parseInt(String.valueOf(result));
    }
}
