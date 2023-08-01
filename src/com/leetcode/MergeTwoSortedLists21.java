package com.leetcode;

public class MergeTwoSortedLists21 {

    public static class ListNode {
        int val;
        public ListNode next;

        ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null)
            return list2;

        if (list2 == null)
            return list1;

        ListNode lista = (list1.val <= list2.val) ? list1 : list2;
        ListNode head = lista;
        ListNode listb = (list1.val <= list2.val) ? list2 : list1;

        while (lista.next != null || listb.next != null) {
            if (lista.next == null) {
                lista.next = listb;
            }
            if (lista.next.val <= listb.val) {
                lista = lista.next;
            }
            else {
                ListNode temp = lista.next;
                lista.next = listb;
                lista = listb;
                listb = temp;
            }
        }

        return head;
    }

}

