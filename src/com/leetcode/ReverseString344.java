package com.leetcode;

public class ReverseString344 {
    public void reverseString(char[] s) {
        int j = 1 - s.length  % 2;
        for (int i = s.length / 2; i < s.length; i++) {
            int mirror = s.length / 2 - j;
            char c_i = s[mirror];
            s[mirror] = s[i];
            s[i] = c_i;
            j++;
        }
    }
}

class Runner344 {

    public static void main(String[] args) {

        ReverseString344 sol = new ReverseString344();
        char[] c = {'h', 'e', 'l', 'l', 'o'};
        sol.reverseString(c);
        System.out.println(c);

    }

}
