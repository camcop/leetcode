package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters3 {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        Map<Character, Integer> chars = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (chars.containsKey(c)) {
                int last = chars.get(c);
                start = last + 1;
                Map<Character, Integer> newChars = new HashMap<>();
                for (Character key : chars.keySet()) {
                    if (chars.get(key) > last) {
                        newChars.put(key, chars.get(key));
                    }
                }
                chars = newChars;
            } else {
                max = Math.max(i - start + 1, max);
            }
            chars.put(c, i);
        }

        return max;
    }

}


class Runner3 {

    public static void main(String[] args) {

        LongestSubstringWithoutRepeatingCharacters3 sol = new LongestSubstringWithoutRepeatingCharacters3();
        System.out.println(sol.lengthOfLongestSubstring("dvdf"));
        System.out.println(sol.lengthOfLongestSubstring("dddddd"));
        System.out.println(sol.lengthOfLongestSubstring("abcabcbb"));


    }

}