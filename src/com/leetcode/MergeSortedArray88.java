package com.leetcode;

import java.util.Arrays;

public class MergeSortedArray88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] nums1_copy = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            nums1_copy[i] = nums1[i];
        }

        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < (m + n); i++) {

            if (p1 >= m) {
                nums1[i] = nums2[p2];
                p2 += 1;
            }
            else if (p2 >= n) {
                nums1[i] = nums1_copy[p1];
                p1 += 1;
            } else if (nums1_copy[p1] <= nums2[p2]) {
                nums1[i] = nums1_copy[p1];
                p1 += 1;
            } else {
                nums1[i] = nums2[p2];
                p2 += 1;
            }

        }

    }

}


class Solution88 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        MergeSortedArray88 sol = new MergeSortedArray88();
        sol.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }

}