package Array.SortColors_75;

/**
 75. Sort Colors

 Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

 Follow up:
 Could you solve this problem without using the library's sort function?
 Could you come up with a one-pass algorithm using only O(1) constant space?

 Example 1:
 Input: nums = [2,0,2,1,1,0]
 Output: [0,0,1,1,2,2]

 Example 2:
 Input: nums = [2,0,1]
 Output: [0,1,2]

 Example 3:
 Input: nums = [0]
 Output: [0]

 Example 4:
 Input: nums = [1]
 Output: [1]

 Constraints:
 n == nums.length
 1 <= n <= 300
 nums[i] is 0, 1, or 2.
 */

public class Solution {
    public void sortColors(int[] nums) {
        int first = 0, second = 0, third = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                first++;
            } else if (nums[i] == 1) {
                second++;
            } else if (nums[i] == 2) {
                third++;
            }
        }

        int index = 0;

        while (first > 0) {
            nums[index++] = 0;

            first--;
        }

        while (second > 0) {
            nums[index++] = 1;

            second--;
        }

        while(third > 0) {
            nums[index++] = 2;

            third--;
        }
    }
}
