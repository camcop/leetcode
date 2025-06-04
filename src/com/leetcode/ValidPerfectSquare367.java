package com.leetcode;

public class ValidPerfectSquare367 {
    public boolean isPerfectSquare(int num) {

        int left = 0;
        int right = 46341;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int square = (int) Math.pow(mid, 2);
            if (square == num) return true;
            if (square > num) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }


}


class Runner367 {

    public static void main(String[] args) {
        ValidPerfectSquare367 sol = new ValidPerfectSquare367();
        System.out.println(sol.isPerfectSquare(2147395600));

    }

}