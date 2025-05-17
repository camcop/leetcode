package com.leetcode;

import java.util.List;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class PalindromeLinkedList234 {

    public boolean isPalindrome(ListNode head) {

        ListNode first = head;
        int length = 0;
        while (first != null) {
            length++;
            first = first.next;
        }

        int index = 0;
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            if (index < length / 2) {
                stack.push(head.val);
            } else if (!(length % 2 != 0 && index == length / 2) && (index >= length / 2)) {
                if (head.val != stack.pop())
                    return false;
            }
            index++;
            head = head.next;
        }

        return true;

    }

}

class Runner234 {

    public static void main(String[] args) {

        PalindromeLinkedList234 sol = new PalindromeLinkedList234();
        ListNode n1 = new ListNode();
        n1.val = 1;
        ListNode n2 = new ListNode();
        n2.val = 0;
        ListNode n3 = new ListNode();
        n3.val = 1;
        n1.next = n2;
        n2.next = n3;

        System.out.println(sol.isPalindrome(n1));


    }

}
