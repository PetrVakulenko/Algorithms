package LinkedList.RemveLinkedListElements_203;

import Utils.ListNode;

public class Main{
    public static void main(String[] argv) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        node1.next = node2;
        ListNode node3 = new ListNode(2);
        node2.next = node3;

        Solution s = new Solution();
        ListNode.inorder(s.removeElements(node1, 1));
    }
}
