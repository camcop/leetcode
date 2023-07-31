package com.leetcode;

public class ReverseLinkedList206 {

    public static class ListNode {
        int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }


    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        if (current == null)
            return current;

        ListNode next = current.next;
        while (next != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        if (prev == null)
            return current;
        return prev;
    }




}
