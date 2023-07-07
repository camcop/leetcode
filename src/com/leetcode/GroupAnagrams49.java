package com.leetcode;

import java.util.*;

public class GroupAnagrams49 {

    private static boolean isAnagram(String string1, String string2) {

        if (string1.length() != string2.length())
            return false;

        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);

//        Set<Character> charSet1 = new HashSet<>();
//        for (Character c: string1.toCharArray())
//            charSet1.add(c);
//
//        Set<Character> charSet2 = new HashSet<>();
//        for (Character c: string2.toCharArray())
//            charSet2.add(c);
//
//        return (string1.length() == string2.length()) && (charSet1.equals(charSet2));
    }


    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String charstring = new String(chars);
            if (map.get(charstring) == null) {
                List<String> list = new ArrayList<String>();
                list.add(s);
                map.put(charstring, list);
            } else {
                map.get(charstring).add(s);
            }
        }

        List<List<String>> output = new ArrayList<>();

        for (Map.Entry<String, List<String>> entry: map.entrySet()) {
            output.add(entry.getValue());
        }
        return output;


//        List<List<String>> output = new ArrayList<>();

        // Iterate through each string
        // Iterate through each list in output
        // If string is an anagram of first item in list, add to that list and move on
        // Otherwise create new list and add to that, and add list to output
        // Return output

        // isAnagram(String string1, String string2)
        // Count of each character in set of union of strings 1 and 2 is equal in each string

//        outerloop:
//        for (String str: strs) {
//            for (List<String> group : output) {
//                if (isAnagram(str, group.get(0))) {
//                    group.add(str);
//                    continue outerloop;
//                }
//            }
//            List<String> newGroup = new ArrayList<>();
//            newGroup.add(str);
//            output.add(newGroup);
//        }
//
//        return output;
    }
}
