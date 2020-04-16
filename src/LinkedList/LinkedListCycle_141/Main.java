package LinkedList.LinkedListCycle_141;

import Utils.ListNode;

public class Main{
    public static void main(String[] argv) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        node2.next = node1;

        Solution s = new Solution();

        System.out.println(s.hasCycle(node1));
    }
}
