package Math.AddDigits_258;

/**
 258. Add Digits
 https://leetcode.com/problems/add-digits/description/

 Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

 Example:

 Input: 38
 Output: 2
 Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
 Since 2 has only one digit, return it.
 Follow up:
 Could you do it without any loop/recursion in O(1) runtime?
 */

public class Solution {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }

        int res;

        while (num > 9) {
            res = 0;
            while (num > 9) {
                res += num % 10;
                num = num / 10;
            }
            res += num;
            num = res;
        }

        return num;
    }
}
