package Math.MajorityElement_169;

import java.util.Arrays;

/**
 169. Majority Element

 Given an array of size n, find the majority element.
 The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 You may assume that the array is non-empty and the majority element always exist in the array.

 Example 1:
 Input: [3,2,3]
 Output: 3

 Example 2:
 Input: [2,2,1,1,1,2,2]
 Output: 2
 */

public class Solution {
    public int majorityElement1(int[] nums) {
        Arrays.sort(nums);

        int size = nums.length, half = size/2, count = 1;

        if (size == 1) {
            return nums[0];
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                count++;

                if (count > half) {
                    return nums[i];
                }
            } else {
                count = 1;
            }
        }

        return 0;
    }

    public int majorityElement(int[] nums) {
        int res = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                res = num;
                count++;
            }
            else {
                if (num != res) {
                    count--;
                }
                else {
                    count++;
                }
            }
        }

        return res;
    }
}
