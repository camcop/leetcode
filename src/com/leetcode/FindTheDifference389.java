package com.leetcode;

import java.util.Arrays;

public class FindTheDifference389 {

    public char findTheDifference(String s, String t) {
        char[] s_list = s.toCharArray();
        Arrays.sort(s_list);
        char[] t_list = t.toCharArray();
        Arrays.sort(t_list);

        for (int i = 0; i < s_list.length; i++) {
            if (s_list[i] != t_list[i]) return t_list[i];
        }

        return t_list[t_list.length - 1];
    }
}

class Runner389 {

    public static void main(String[] args) {

        FindTheDifference389 sol = new FindTheDifference389();
        String s = "a";
        String t = "aa";
        System.out.println(sol.findTheDifference(s, t));


    }

}


