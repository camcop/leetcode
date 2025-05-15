package com.leetcode;

import java.util.Stack;

public class ImplementQueueUsingStacks232 {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public ImplementQueueUsingStacks232() {
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        while (s1.size() > 1) {
            s2.push(s1.pop());
        }
        int val = s1.pop();
        reset();
        return val;
    }

    public int peek() {
        while (s1.size() > 1) {
            s2.push(s1.pop());
        }
        int val = s2.push(s1.pop());
        reset();
        return val;
    }

    private void reset() {
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

