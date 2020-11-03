package LinkedList.InsertionSortList_147;

import Utils.ListNode;

public class Main{
    public static void main(String[] argv) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        node1.next = node2;

        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        node3.next = node4;

        Solution s = new Solution();

        System.out.println(s.insertionSortList(node1));
    }
}
