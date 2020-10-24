package LinkedList.RotateList_61;

import Utils.ListNode;

import java.util.List;

/**
 61. Rotate List

 Given a linked list, rotate the list to the right by k places, where k is non-negative.

 Example 1:
 Input: 1->2->3->4->5->NULL, k = 2
 Output: 4->5->1->2->3->NULL
 Explanation:
 rotate 1 steps to the right: 5->1->2->3->4->NULL
 rotate 2 steps to the right: 4->5->1->2->3->NULL

 Example 2:
 Input: 0->1->2->NULL, k = 4
 Output: 2->0->1->NULL
 Explanation:
 rotate 1 steps to the right: 2->0->1->NULL
 rotate 2 steps to the right: 1->2->0->NULL
 rotate 3 steps to the right: 0->1->2->NULL
 rotate 4 steps to the right: 2->0->1->NULL
 */

public class Solution {
    List<Integer> list;

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) // check base cases if head null or we have to rotate right 0 nodes
            return head;
        int length = 0;
        ListNode tail = head;
        while(tail.next != null) { // count the number of nodes and reach to the tail of list
            length++;
            tail = tail.next;
        }
        length++; // count tail node
        tail.next = head; // join tail with head
        int rotatePoint = length - k % length; //
        tail = head;
        while(rotatePoint-- > 1)
            tail = tail.next;
        head = tail.next;
        tail.next = null;
        return head;
    }
}
