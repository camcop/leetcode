package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku36 {

    public static boolean isValidSudoku(char[][] board) {

        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> boxes = new HashMap<>();

        for (int i = 0; i < board.length; i++) {
            if (!rows.containsKey(i))
                rows.put(i, new HashSet<>());

            for (int j = 0; j < board[i].length; j++) {
                char cell = board[i][j];

                if (!Character.isDigit(cell))
                    continue;

                if (!cols.containsKey(j))
                    cols.put(j, new HashSet<>());

                int box = (i / 3) + (3 * (j / 3)) + 1;
                if (!boxes.containsKey(box))
                    boxes.put(box, new HashSet<>());

                if (rows.get(i).contains(cell)) {
                    return false;
                }
                else
                    rows.get(i).add(cell);

                if (cols.get(j).contains(cell)) {
                    return false;
                }
                else
                    cols.get(j).add(cell);

                if (boxes.get(box).contains(cell)) {
                    return false;
                }
                else
                    boxes.get(box).add(cell);
            }
        }

        return true;
    }

}
