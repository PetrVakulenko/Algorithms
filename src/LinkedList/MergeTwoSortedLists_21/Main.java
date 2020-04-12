package LinkedList.MergeTwoSortedLists_21;

import Utils.ListNode;

public class Main{
    public static void main(String[] argv) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(4);
        node2.next = node3;

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        node4.next = node5;
        ListNode node6 = new ListNode(4);
        node5.next = node6;

        Solution s = new Solution();
        s.mergeTwoLists(node1, node4);
    }
}
