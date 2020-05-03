package Array.ShortestUnsortedContinuousSubarray_581;

import java.util.Arrays;

/**
 581. Shortest Unsorted Continuous Subarray
 Easy

 2338

 120

 Add to List

 Share
 Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.

 You need to find the shortest such subarray and output its length.

 Example 1:
 Input: [2, 6, 4, 8, 10, 9, 15]
 Output: 5
 Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
 Note:
 Then length of the input array is in range [1, 10,000].
 The input array may contain duplicates, so ascending order here means <=.

 */
public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if (nums.length < 2) return 0;

        int[] nums1 = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums1);

        int result = nums.length, i = 0, j = nums.length - 1;

        while (i <= j) {
            if (i == j && nums[i] == nums1[i]) {
                result--;
                break;
            }

            if (nums[i] == nums1[i]) {
                i++;
            }
            if (nums[j] == nums1[j]) {
                j--;
            }

            if (nums[i] != nums1[i] && nums[j] != nums1[j]) break;
        }

        return result - i - (nums.length - 1 - j);
    }
}
