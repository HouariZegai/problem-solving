package com.houarizegai.leetcode.easy;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("()"));
        System.out.println(new ValidParentheses().isValid("([)]"));
        System.out.println(new ValidParentheses().isValid("()[]{}"));
    }

    public boolean isValid(String s) {
        if(s == null || s.length() == 0)
            return true;

        StringBuilder reminds = new StringBuilder(s.substring(0, 1));

        for(int i = 1; i < s.length(); i++) {
            if(reminds.isEmpty()) {
                reminds.append(s.charAt(i));
                continue;
            }

            char lastAdded = reminds.charAt(reminds.length() - 1);
            if((lastAdded == '(' && s.charAt(i) == ')') || (lastAdded == '{' && s.charAt(i) == '}') ||
                    (lastAdded == '[' && s.charAt(i) == ']'))
                reminds.delete(reminds.length() - 1, reminds.length());
            else
                reminds.append(s.charAt(i));
        }

        return reminds.isEmpty();
    }
}
