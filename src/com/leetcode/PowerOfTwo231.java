package com.leetcode;

public class PowerOfTwo231 {

    public boolean isPowerOfTwo(int n) {

        if (n <= 0) return false;

        while (n > 2) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }
        return true;

    }

}
