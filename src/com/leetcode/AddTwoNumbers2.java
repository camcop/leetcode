package com.leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class AddTwoNumbers2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode out = new ListNode();

        ListNode node = out;
        int carry = 0;
        while (l1 != null || l2 != null | carry != 0) {
            if (l1 == null) {
                l1 = new ListNode();
                l1.val = 0;
            }
            if (l2 == null) {
                l2 = new ListNode();
                l2.val = 0;
            }
            int sum = l1.val + l2.val + carry;
            int rem = sum % 10;
            node.val = rem;
            carry = sum / 10;

            if (l1.next != null || l2.next != null | carry != 0) node.next = new ListNode();
            node = node.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        return out;
    }

}
