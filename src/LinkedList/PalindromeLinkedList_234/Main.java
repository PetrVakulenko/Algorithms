package LinkedList.PalindromeLinkedList_234;

import Utils.ListNode;

public class Main{
    public static void main(String[] argv) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next = node5;

        Solution s = new Solution();
        System.out.println("Result:");
        System.out.println(s.isPalindrome(node1));
    }
}
