package com.leetcode;

class VersionControl278 {

    int bad = 4;

    boolean isBadVersion(int version) {
        return version >= this.bad;
    }

}

public class FirstBadVersion278 extends VersionControl278 {

    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }


}

class Runner278 {

    public static void main(String[] args) {

        FirstBadVersion278 sol = new FirstBadVersion278();
        System.out.println(sol.isBadVersion(3));


    }

}
