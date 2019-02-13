package LinkedList.ReverseLinkedList_206;

import Utils.ListNode;

/**
 206. Reverse Linked List
 https://leetcode.com/problems/reverse-linked-list/

 Reverse a singly linked list.

 Example:
 Input: 1->2->3->4->5->NULL
 Output: 5->4->3->2->1->NULL

 Follow up:
 A linked list can be reversed either iteratively or recursively. Could you implement both?
 */

public class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(null, head);
    }

    private ListNode reverse(ListNode prev, ListNode curr)
    {
        if (curr == null) return null;
        if (curr.next == null) {
            curr.next = prev;
            return curr;
        }

        ListNode next = curr.next;
        curr.next = prev;
        return reverse(curr, next);
    }
}
