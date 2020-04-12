package LinkedList.MergeTwoSortedLists_21;

import Utils.ListNode;

/**
 21. Merge Two Sorted Lists

 Merge two sorted linked lists and return it as a new list.
 The new list should be made by splicing together the nodes of the first two lists.

 Example:
 Input: 1->2->4, 1->3->4
 Output: 1->1->2->3->4->4
 */

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;

        if (l1 == null) {
            ListNode result = new ListNode(l2.val);
            result.next = mergeTwoLists(l1, l2.next);

            return result;
        }

        if (l2 == null) {
            ListNode result = new ListNode(l1.val);
            result.next = mergeTwoLists(l1.next, l2);

            return result;
        }

        if (l1.val < l2.val) {
            ListNode result = new ListNode(l1.val);
            result.next = mergeTwoLists(l1.next, l2);

            return result;
        }


        ListNode result = new ListNode(l2.val);
        result.next = mergeTwoLists(l1, l2.next);

        return result;
    }
}
