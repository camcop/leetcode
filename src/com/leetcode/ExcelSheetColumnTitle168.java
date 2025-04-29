package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ExcelSheetColumnTitle168 {

    public String convertToTitle(int columnNumber) {

        StringBuilder result = new StringBuilder();

        while (columnNumber-- > 0) {
            result.insert(0, (char) ('A' + columnNumber % 26));
            columnNumber /= 26;
        }

        return result.toString();

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