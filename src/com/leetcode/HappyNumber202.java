package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber202 {

    public boolean isHappy(int n) {

        Set<Integer> visited = new HashSet<>();
        visited.add(n);

        while (true) {
            int sum = 0;
            String n_str = String.valueOf(n);
            for (int i = 0; i < n_str.length(); i++) {
                sum += Math.pow(Integer.parseInt(String.valueOf(n_str.charAt(i))), 2);
            }
            if (sum == 1) return true;
            if (visited.contains(sum)) return false;
            visited.add(sum);
            n = sum;
        }

    }

}

class Runner202 {

    public static void main(String[] args) {

        HappyNumber202 sol = new HappyNumber202();
        System.out.println(sol.isHappy(19));

    }

}
