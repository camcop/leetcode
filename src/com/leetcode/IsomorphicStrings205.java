package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings205 {

    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char s_char = s.charAt(i);
            char t_char = t.charAt(i);
            if (!map.containsKey(s_char)) {
                if (map.containsValue(t_char)) {
                    return false;
                }
                map.put(s_char, t_char);
            } else {
                if (map.get(s_char) != t_char) {
                    return false;
                }
            }
        }

        return true;

    }

}

class Runner205 {

    public static void main(String[] args) {

        IsomorphicStrings205 sol = new IsomorphicStrings205();
        System.out.println(sol.isIsomorphic("paper", "title"));

    }
}