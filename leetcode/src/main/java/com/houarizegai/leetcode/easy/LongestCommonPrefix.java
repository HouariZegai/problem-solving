package com.houarizegai.leetcode.easy;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        final LongestCommonPrefix commonPrefix = new LongestCommonPrefix();
        System.out.println(commonPrefix.longestCommonPrefix(new String[]{"flower"}));
        System.out.println(commonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(commonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println(commonPrefix.longestCommonPrefix(new String[]{"reflower", "flow", "flight"}));
        System.out.println(commonPrefix.longestCommonPrefix(new String[]{"flower","flower","flower","flower"}));
        System.out.println(commonPrefix.longestCommonPrefix(new String[]{"c","acc","ccc"}));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];

        String commonPrefix = "";
        String first = strs[0];
        for (int i = 0; i <= first.length(); i++) {
            final String prefix = first.substring(0, i);
            for (int j = 1; j < strs.length; j++)
                if (!strs[j].startsWith(prefix))
                    return commonPrefix;

            if (commonPrefix.length() < prefix.length())
                commonPrefix = prefix;
        }

        return commonPrefix;
    }
}
