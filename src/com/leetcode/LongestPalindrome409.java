package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome409 {
    public int longestPalindrome(String s) {
        Set<Character> seen = new HashSet<>();

        int pal = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (!seen.contains(c)) seen.add(c);
            else {
                pal += 2;
                seen.remove(c);
            }
        }

        if (seen.size() > 0) pal += 1;
        return pal;
    }

}
