package com.leetcode;

import java.util.*;

public class GroupAnagrams49 {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String charstring = new String(chars);

            if (!map.containsKey(charstring)) {
                map.put(charstring, new ArrayList<>());
            }
            map.get(charstring).add(charstring);

        }

        List<List<String>> output = new ArrayList<>();

        for (Map.Entry<String, List<String>> entry: map.entrySet()) {
            output.add(entry.getValue());
        }
        return output;

    }
}
