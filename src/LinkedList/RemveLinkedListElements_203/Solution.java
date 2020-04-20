package LinkedList.RemveLinkedListElements_203;

import Utils.ListNode;

/**
 203. Remove Linked List Elements

 Remove all elements from a linked list of integers that have value val.

 Example:
 Input:  1->2->6->3->4->5->6, val = 6
 Output: 1->2->3->4->5
 */

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null || (head.val == val && head.next == null)) return null;

        if (head.val == val) return removeElements(head.next, val);

        head.next = removeElements(head.next, val);

        return head;
    }
}
