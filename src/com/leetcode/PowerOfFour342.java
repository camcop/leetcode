package com.leetcode;

public class PowerOfFour342 {

    public boolean isPowerOfFour(int n) {

        while (n > 4) {
            if (n % 4 != 0) return false;
            n /= 4;
        }

        return n==4 || n==1;
    }

    public boolean isPowerOfFourNoLoops(int n) {
        return (Math.log(n) / Math.log(4) % 1 == 0);
    }

}
