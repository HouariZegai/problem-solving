package com.houarizegai.leetcode.easy;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(12321));
        System.out.println(new PalindromeNumber().isPalindrome(123));
    }

    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        if(x < 10)
            return true;

        int result = 0;
        int reminds = x;
        while(reminds > 0) {
            result = result * 10 + (reminds % 10);
            reminds /= 10;
        }

        return result == x;
    }
}
