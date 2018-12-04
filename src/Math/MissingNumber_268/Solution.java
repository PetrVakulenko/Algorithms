package Math.MissingNumber_268;

/**
 268. Missing Number
 https://leetcode.com/problems/missing-number/description/

 Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

 Example 1:
 Input: [3,0,1]
 Output: 2

 Example 2:
 Input: [9,6,4,2,3,5,7,0,1]
 Output: 8
 Note:
 Your algorithm should run in linear runtime complexity.
    Could you implement it using only constant extra space complexity?

 [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 */

public class Solution {
    public int missingNumber(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int sum = 0, i = 0, j = nums.length;

        while (i <= j) {
            if (i == j) {
                sum = sum + i - nums[i];
            } else {
                sum = sum + i + j - nums[i];

                if (j != nums.length)
                    sum -= nums[j];
            }
            i++;
            j--;
        }

        return sum;
    }
}
