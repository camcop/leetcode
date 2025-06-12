package com.leetcode;

import java.util.ArrayList;

import static java.util.stream.Collectors.toCollection;

public class FindTheDifference389 {

    public char findTheDifference(String s, String t) {
        ArrayList<Character> s_list = s.chars().mapToObj(c -> (char) c).collect(toCollection(ArrayList::new));
        ArrayList<Character> t_list = t.chars().mapToObj(c -> (char) c).collect(toCollection(ArrayList::new));

        for (Character c : s_list) {
            t_list.remove(c);
        }

        return (char) t_list.stream().findFirst().get();
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


