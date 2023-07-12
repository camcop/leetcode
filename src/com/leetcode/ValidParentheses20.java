package com.leetcode;

import java.util.Stack;

public class ValidParentheses20 {

    public static boolean isValid(String s) {

        String open = "({[";
        String close = ")}]";

        Stack<Character> stack = new Stack<>();

        for (Character c: s.toCharArray()) {
            int index = open.indexOf(c);
            if (index != -1)
                stack.add(c);
            else {
                if (stack.empty() || close.indexOf(c) != open.indexOf(stack.pop()))
                    return false;
            }
        }

        return stack.empty();
    }

}
