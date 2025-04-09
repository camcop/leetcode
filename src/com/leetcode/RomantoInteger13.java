package com.leetcode;

import java.util.HashMap;

class Solution13 {
    public int romanToInt(String s) {

        HashMap<Character, Integer> conversion = new HashMap<>();
        conversion.put('I', 1);
        conversion.put('V', 5);
        conversion.put('X', 10);
        conversion.put('L', 50);
        conversion.put('C', 100);
        conversion.put('D', 500);
        conversion.put('M', 1000);

        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i != s.length() - 1) {
                if (c == 'I') {
                    if (s.charAt(i + 1) == 'V') {
                        num += 4;
                        i++;
                        continue;
                    }
                    if (s.charAt(i + 1) == 'X') {
                        num += 9;
                        i++;
                        continue;
                    }
                }
                if (c == 'X') {
                    if (s.charAt(i + 1) == 'L') {
                        num += 40;
                        i++;
                        continue;
                    }
                    if (s.charAt(i + 1) == 'C') {
                        num += 90;
                        i++;
                        continue;
                    }
                }
                if (c == 'C') {
                    if (s.charAt(i + 1) == 'D') {
                        num += 400;
                        i++;
                        continue;
                    }
                    if (s.charAt(i + 1) == 'M') {
                        num += 900;
                        i++;
                        continue;
                    }
                }
            }
            num += conversion.get(s.charAt(i));
        }

        return num;
    }
}
class Runner13 {

    public static void main(String[] args) {
        String roman = "III";

        Solution13 sol = new Solution13();
        System.out.println(sol.romanToInt(roman));
    }

}