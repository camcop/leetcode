package com.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class ImplementStackUsingQueues225 {

    Queue<Integer> q1 = new ArrayDeque<>();
    Queue<Integer> q2 = new ArrayDeque<>();

    public ImplementStackUsingQueues225() {
    }

    public void push(int x) {
        this.q1.add(x);
    }

    public int pop() {
        while (this.q1.size() > 1) {
            this.q2.add(this.q1.remove());
        }
        Integer next = this.q1.remove();
        while (this.q2.size() > 0) {
            this.q1.add(this.q2.remove());
        }
        return next;
    }

    public int top() {
        while (this.q1.size() > 1) {
            this.q2.add(this.q1.remove());
        }
        Integer next = this.q1.remove();
        this.q2.add(next);
        while (this.q2.size() > 0) {
            this.q1.add(this.q2.remove());
        }
        return next;
    }

    public boolean empty() {
        return this.q1.isEmpty();
    }
}

class Runner225 {

    public static void main(String[] args) {

        ImplementStackUsingQueues225 sol = new ImplementStackUsingQueues225();
        sol.push(1);
        sol.push(2);
        System.out.println(sol.top());
        System.out.println(sol.pop());
        System.out.println(sol.empty());

        /**
         * Your MyStack object will be instantiated and called as such:
         * MyStack obj = new MyStack();
         * obj.push(x);
         * int param_2 = obj.pop();
         * int param_3 = obj.top();
         * boolean param_4 = obj.empty();
         */
    }


}
