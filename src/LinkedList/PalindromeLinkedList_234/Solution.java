package LinkedList.PalindromeLinkedList_234;

import Utils.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 234. Palindrome Linked List

 Given a singly linked list, determine if it is a palindrome.

 Example 1:
 Input: 1->2
 Output: false

 Example 2:
 Input: 1->2->2->1
 Output: true

 Follow up:
 Could you do it in O(n) time and O(1) space?
 */

public class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList();

        while(head != null) {
            list.add(head.val);
            head = head.next;
        }

        int i = 0, j = list.size() - 1;

        while (i < j) {
            if (list.get(i++) - list.get(j--) != 0) return false;
        }

        return true;
    }
}
