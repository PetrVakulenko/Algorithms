package LinkedList.ConvertBinaryNumberInALinkedListToInteger_1290;

import Utils.ListNode;

public class Main{
    public static void main(String[] argv) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;

        Solution s = new Solution();

        System.out.println(s.getDecimalValue(node1));
    }
}
