package Array.MaxConsecutiveOnes_485;

/**
 485. Max Consecutive Ones
 https://leetcode.com/problems/max-consecutive-ones/description/

 Given a binary array, find the maximum number of consecutive 1s in this array.

 Example 1:
 Input: [1,1,0,1,1,1]
 Output: 3
 Explanation: The first two digits or the last three digits are consecutive 1s.
 The maximum number of consecutive 1s is 3.

 Note:
 The input array will only contain 0 and 1.
 The length of input array is a positive integer and will not exceed 10,000
 */

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }

        if (len == 1) {
            return nums[0];
        }

        int bigger = 0, prev = nums[0], i, counter;

        counter = nums[0] == 1 ? 1 : 0;

        for(i = 1; i < nums.length; i++) {
            if (nums[i] == 0 || nums[i] != prev) {
                if (counter > bigger) {
                    bigger = counter;
                }
                counter = nums[i] == 1 ? 1 : 0;
                prev = nums[i];
                continue;
            }

            if (nums[i] == prev) {
                counter++;
            }
        }

        if (counter > bigger) {
            return counter;
        }

        return bigger;
    }
}
