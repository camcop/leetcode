package com.leetcode;

import java.util.Stack;
import java.util.regex.Pattern;

public class ValidPalindrome125 {

    public static boolean isPalindrome(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();
        char[] chars = s.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i]) || Character.isAlphabetic(chars[i])) {
                builder.append(chars[i]);
                stack.push(chars[i]);
            }
        }

        String clean = builder.toString();

        for (int i = 0; i < stack.size(); i++) {
            if (stack.pop() != clean.charAt(i))
                return false;
        }

        return true;
    }
}
