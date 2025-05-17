package com.leetcode;

public class AddDigits258 {

    public int addDigits(int num) {

        if (num < 10) return num;

        while (num >= 10) {
            int sum = 0;
            int units = 0;
            while (num >= 10) {
                units = num % 10;
                sum += units;
                num /= 10;
            }
            sum += num;
            num = sum;
        }

        return num;
    }

}


class Runner258 {

    public static void main(String[] args) {

        AddDigits258 sol = new AddDigits258();
        int num = 38;
        System.out.println(sol.addDigits(num));

    }

}