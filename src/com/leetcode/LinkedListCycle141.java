package com.leetcode;


import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle141 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {

        Set<ListNode> visited = new HashSet<>();

        ListNode node = head;
        while (node != null) {
            if (visited.contains(node)) {
                return true;
            }
            visited.add(node);
            node = node.next;
        }

        return false;
    }


}

class Runner141 {

    public static void main(String[] args) {

        LinkedListCycle141 sol = new LinkedListCycle141();

    }

}