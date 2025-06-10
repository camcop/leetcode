package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString387 {

    public int firstUniqChar(String s) {

        Map<Character, Integer> charCounts = new HashMap<>();
        for (Character c: s.toCharArray()) {
            int count = charCounts.getOrDefault(c, 0);
            charCounts.put(c, count + 1);
        }

        for (int i = 0; i < s.length(); i++)
            if (charCounts.get(s.charAt(i)) == 1) return i;

        return -1;
    }

}
