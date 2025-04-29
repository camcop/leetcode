package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ExcelSheetColumnTitle168 {

    public String convertToTitle(int columnNumber) {

        List<Integer> base26 = new ArrayList<>();

        while (columnNumber-- > 0) {
            int minor = columnNumber % 26;
            base26.add(0, minor);
            columnNumber = columnNumber / 26;
        }

        char[] alpha = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
                'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

        StringBuilder out = new StringBuilder();
        for (int n : base26) {
            out.append(alpha[n]);
        }

        return out.toString();

    }

}


class Runner168 {

    public static void main(String[] args) {

        ExcelSheetColumnTitle168 sol = new ExcelSheetColumnTitle168();
        System.out.println(sol.convertToTitle(1));
        System.out.println(sol.convertToTitle(28));
        System.out.println(sol.convertToTitle(701));

    }

}