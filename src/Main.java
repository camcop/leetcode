import com.leetcode.*;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

//        String[] strs = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
//        System.out.println(GroupAnagrams49.groupAnagrams(strs));

//        int[] ints = new int[] {1,1,1,2,2,3};
//        System.out.println(Arrays.toString(TopKFrequentElements347.topKFrequent(ints, 2)));

//        System.out.println(ValidPalindrome125.isPalindrome("abcdba"));

//        System.out.println(ValidParentheses20.isValid("(]"));
//        System.out.println(ValidParentheses20.isValid("()"));

//        char[] row1 = new char[] {'5','3','.','.','7','.','.','.','.'};
//        char[] row2 = new char[] {'6','.','.','1','9','5','.','.','.'};
//        char[] row3 = new char[] {'.','9','8','.','.','.','.','6','.'};
//        char[] row4 = new char[] {'8','.','.','.','6','.','.','.','3'};
//        char[] row5 = new char[] {'4','.','.','8','.','3','.','.','1'};
//        char[] row6 = new char[] {'7','.','.','.','2','.','.','.','6'};
//        char[] row7 = new char[] {'.','6','.','.','.','.','2','8','.'};
//        char[] row8 = new char[] {'.','.','.','4','1','9','.','.','5'};
//        char[] row9 = new char[] {'.','.','.','.','8','.','.','7','9'};
//        char[][] board = new char[9][9];
//        board[0] = row1;
//        board[1] = row2;
//        board[2] = row3;
//        board[3] = row4;
//        board[4] = row5;
//        board[5] = row6;
//        board[6] = row7;
//        board[7] = row8;
//        board[8] = row9;
//        System.out.println(ValidSudoku36.isValidSudoku(board));

//        int[] numbers = new int[] {2,7,11,15};
//        int[] numbers = new int[] {-1,0};
//        int target = 9;
//        System.out.println(Arrays.toString(TwoSumIIInputArrayIsSorted167.twoSum(numbers, target)));

//        MinStack155 minStack = new MinStack155();
//        minStack.push(-2);
//        minStack.push(0);
//        minStack.push(-3);
//        System.out.println(minStack.getMin()); // return -3
//        minStack.pop();
//        System.out.println(minStack.top());    // return 0
//        System.out.println(minStack.getMin()); // return -2

//        ReverseLinkedList206.ListNode node = new ReverseLinkedList206.ListNode(1);
//        ReverseLinkedList206.ListNode node2 = new ReverseLinkedList206.ListNode(2);
//        ReverseLinkedList206.ListNode node3 = new ReverseLinkedList206.ListNode(3);
//        ReverseLinkedList206.ListNode node4 = new ReverseLinkedList206.ListNode(4);
//        ReverseLinkedList206.ListNode node5 = new ReverseLinkedList206.ListNode(5);
//        node.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        System.out.println(ReverseLinkedList206.reverseList(node));


        MergeTwoSortedLists21.ListNode node = new MergeTwoSortedLists21.ListNode(2);
//        MergeTwoSortedLists21.ListNode node2 = new MergeTwoSortedLists21.ListNode(2);
//        MergeTwoSortedLists21.ListNode node3 = new MergeTwoSortedLists21.ListNode(3);
//        MergeTwoSortedLists21.ListNode node4 = new MergeTwoSortedLists21.ListNode(4);
//        MergeTwoSortedLists21.ListNode node5 = new MergeTwoSortedLists21.ListNode(5);
//        node.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
        MergeTwoSortedLists21.ListNode nodeB = new MergeTwoSortedLists21.ListNode(1);
//        MergeTwoSortedLists21.ListNode nodeB2 = new MergeTwoSortedLists21.ListNode(1);
//        MergeTwoSortedLists21.ListNode nodeB3 = new MergeTwoSortedLists21.ListNode(4);
//        MergeTwoSortedLists21.ListNode nodeB4 = new MergeTwoSortedLists21.ListNode(6);
//        MergeTwoSortedLists21.ListNode nodeB5 = new MergeTwoSortedLists21.ListNode(7);
//        nodeB.next = nodeB2;
//        nodeB2.next = nodeB3;
//        nodeB3.next = nodeB4;
//        nodeB4.next = nodeB5;
        System.out.println(MergeTwoSortedLists21.mergeTwoLists(node, nodeB));


    }
}