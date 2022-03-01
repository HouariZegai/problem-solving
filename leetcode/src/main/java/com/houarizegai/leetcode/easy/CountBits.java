package com.houarizegai.leetcode.easy;

import java.util.Arrays;

public class CountBits {

    public static void main(String[] args) {
        final CountBits bitCounter = new CountBits();

        System.out.println(Arrays.toString(bitCounter.countBits(1)));
        System.out.println(Arrays.toString(bitCounter.countBits(2)));
        System.out.println(Arrays.toString(bitCounter.countBits(4)));
        System.out.println(Arrays.toString(bitCounter.countBits(5)));
        System.out.println(Arrays.toString(bitCounter.countBits(6)));
    }

    public int[] countBits(int n) {
        int[] out = new int[n + 1];
        for(int i = 0; i <= n; i++) {
            out[i] = getSumOf1InBinary(i);
        }
        return out;
    }

    public int getSumOf1InBinary(int n) {
        int count = 0;
        while(n != 0) {
            if(n % 2 == 1)
                count++;
            n /= 2;
        }

        return count;
    }
}
