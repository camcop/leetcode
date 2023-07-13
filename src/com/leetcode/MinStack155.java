package com.leetcode;

import java.util.Stack;

public class MinStack155 {

    private int[] items;
    private int size;
    private Stack<Integer> minIndices = new Stack();

    public MinStack155() {
        items = new int[10092];
    }

    public void push(int val) {
        items[size++] = val;
        if (minIndices.size() == 0 || val < items[minIndices.peek()])
            minIndices.push(size - 1);
    }

    public void pop() {
        if (--size == minIndices.peek())
            minIndices.pop();
        items[size] = 0;
    }

    public int top() {
        return items[size - 1];
    }

    public int getMin() {
        return items[minIndices.peek()];
    }

}
