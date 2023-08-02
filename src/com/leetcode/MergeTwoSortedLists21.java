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

        ListNode combined = (list1.val <= list2.val) ? list1 : list2;
        ListNode first = combined;
        ListNode nexta = combined.next;
        ListNode nextb = (list1.val <= list2.val) ? list2 : list1;
        ListNode temp;

        while (nexta != null || nextb != null) {
            if (nexta == null) {
                temp = nextb.next;
                combined.next = nextb;
                combined = nextb;
                nextb = temp;
            }
            else if (nextb == null) {
                temp = nexta.next;
                combined.next = nexta;
                combined = nexta;
                nexta = temp;
            }
            else if (nextb.val <= nexta.val) {
                temp = nextb.next;
                combined.next = nextb;
                combined = nextb;
                nextb = temp;
            }
            else if (nexta.val <= nextb.val) {
                temp = nexta.next;
                combined.next = nexta;
                combined = nexta;
                nexta = temp;
            }
        }

        return first;
    }

}

