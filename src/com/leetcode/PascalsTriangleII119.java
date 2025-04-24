package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII119 {

    public List<Integer> getRow(int rowIndex) {

        // Creating triangle
        List<List<Integer>> triangle = new ArrayList<>();

        // Creating rows
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            int n = 0;
            // Iterate through previous row to construct elements of current row
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    n = 1;
                } else {
                    n = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                }
            row.add(n);
            }
        triangle.add(row);
        }

        return triangle.get(triangle.size() - 1);
    }


}


class Runner119 {

    public static void main(String[] args) {

        PascalsTriangleII119 sol = new PascalsTriangleII119();

        System.out.println(sol.getRow(3));


    }

}