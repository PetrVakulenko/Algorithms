package BitManipulation.SingleNumberIII_260;

import java.util.*;

/**
 260. Single Number III

 Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

 Example:
 Input:  [1,2,1,3,2,5]
 Output: [3,5]

 Note:
 The order of the result is not important. So in the above example, [5, 3] is also correct.
 Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 */

public class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);

        int[] result = new int[2];

        int index = 0;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                if (count == 1) {
                    result[index++] = nums[i-1];
                }

                count = 1;
            } else {
                count++;
            }

            if (index > 1) return result;
        }

        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            result[1] = nums[nums.length - 1];
        }

        return result;
    }
}
