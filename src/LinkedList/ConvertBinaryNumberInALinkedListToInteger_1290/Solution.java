package LinkedList.ConvertBinaryNumberInALinkedListToInteger_1290;

import Utils.ListNode;

/**
 1290. Convert Binary Number in a Linked List to Integer

 Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

 Return the decimal value of the number in the linked list.

 Example 1:
 Input: head = [1,0,1]
 Output: 5
 Explanation: (101) in base 2 = (5) in base 10

 Example 2:
 Input: head = [0]
 Output: 0

 Example 3:
 Input: head = [1]
 Output: 1

 Example 4:
 Input: head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
 Output: 18880

 Example 5:
 Input: head = [0,0]
 Output: 0
 */

public class Solution {
    private int digit = 0;

    public int getDecimalValue(ListNode head) {
        if (head.next == null) {
            return head.val;
        }

        int currentValue = getDecimalValue(head.next);

        digit++;

        return currentValue + (head.val * ((int) Math.pow(2, digit)));
    }
}
