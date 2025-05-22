package com.leetcode;

import java.util.*;

public class WordPattern290 {

    public boolean wordPattern(String pattern, String s) {

        Map<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        Set<String> set = new HashSet<>();

        if (pattern.length() != words.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!words[i].equals(map.get(c))) return false;
            } else {
                if (set.contains(words[i])) return false;
                map.put(c, words[i]);
                set.add(words[i]);
            }
        }

        return true;
    }

}

class Runner290 {

    public static void main(String[] args) {

        WordPattern290 sol = new WordPattern290();
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(sol.wordPattern(pattern, s));

    }
}
