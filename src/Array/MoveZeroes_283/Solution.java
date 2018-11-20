package Array.MoveZeroes_283;

/**
 283. Move Zeroes
 https://leetcode.com/problems/move-zeroes/description/

 Given an array nums,
    write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 Example:
 Input: [0,1,0,3,12]
 Output: [1,3,12,0,0]

 Note:
 You must do this in-place without making a copy of the array.
 Minimize the total number of operations.
 */

public class Solution {
    public int[] moveZeroes(int[] nums) {
        int len = nums.length, i;

        if (len <= 1) {
            return nums;
        }

        int notnullindex = 0;

        for(i = 0; i < len; i++) {
            if (nums[i] == 0) {
                continue;
            }

            if (nums[i] != 0) {
                nums[notnullindex++] = nums[i];
            }
        }

        for(i = notnullindex; i < len; i++) {
            nums[i] = 0;
        }

        return nums;
    }
}
