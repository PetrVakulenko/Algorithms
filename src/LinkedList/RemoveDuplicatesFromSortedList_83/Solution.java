package LinkedList.RemoveDuplicatesFromSortedList_83;

import Utils.ListNode;

/**
 83. Remove Duplicates from Sorted List

 Given a sorted linked list, delete all duplicates such that each element appear only once.

 Example 1:
 Input: 1->1->2
 Output: 1->2

 Example 2:
 Input: 1->1->2->3->3
 Output: 1->2->3
 */

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        if (head.next.val == head.val) {
            head.next = head.next.next;
            head = deleteDuplicates(head);
        } else {
            head.next = deleteDuplicates(head.next);
        }

        return head;
    }
}
