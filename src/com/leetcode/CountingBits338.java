package com.leetcode;

import java.util.Arrays;

public class CountingBits338 {

    public int[] countBits(int n) {

        int[] counts = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            int c = 0;
            int j = i;
            while (j > 1) {
                j = j - (int) Math.floor(Math.log(j) / Math.log(2));
                c++;
            }
            counts[i] = c;
        }

        return counts;
    }


}


class Runner338 {

    public static void main(String[] args) {
        CountingBits338 sol = new CountingBits338();
        System.out.println(Arrays.toString(sol.countBits(32)));

    }

}