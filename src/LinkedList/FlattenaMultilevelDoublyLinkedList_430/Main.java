package LinkedList.FlattenaMultilevelDoublyLinkedList_430;

import Utils.LinkedListNode;

public class Main{
    public static void main(String[] argv) {
        LinkedListNode node1 = new LinkedListNode(1);
        LinkedListNode node2 = new LinkedListNode(2);
        node1.next = node2;
        LinkedListNode node3 = new LinkedListNode(3);
        node2.next = node3;
        LinkedListNode node4 = new LinkedListNode(4);
        node3.next = node4;
        LinkedListNode node5 = new LinkedListNode(5);
        node4.next = node5;

        Solution s = new Solution();
        System.out.println("Result:");
        s.flatten(node1);
    }
}
