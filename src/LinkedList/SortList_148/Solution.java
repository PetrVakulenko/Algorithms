package LinkedList.SortList_148;

import Utils.ListNode;

import java.util.List;

/**
 148. Sort List

 Given the head of a linked list, return the list after sorting it in ascending order.
 Follow up: Can you sort the linked list in O(n logn) time and O(1) memory (i.e. constant space)?

 Example 1:
 Input: head = [4,2,1,3]
 Output: [1,2,3,4]

 Example 2:
 Input: head = [-1,5,3,4,0]
 Output: [-1,0,3,4,5]

 Example 3:
 Input: head = []
 Output: []

 Constraints:
 The number of nodes in the list is in the range [0, 5 * 104].
 -105 <= Node.val <= 105
 */

public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode middle = getMiddle(head);
        ListNode leftHead = head;
        ListNode rightHead = middle.next;
        middle.next = null;

        ListNode left = sortList(leftHead);
        ListNode right = sortList(rightHead);

        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        while(left!=null && right!=null) {
            if (left.val<=right.val) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }

        curr.next = left == null ? right : left;

        return dummy.next;
    }

    private ListNode getMiddle(ListNode head) {
        if (head == null) return head;

        ListNode slow = head, fast = head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
