package Array.ProductOfArrayExceptSelf_238;

/**
 238. Product of Array Except Self

 Given an array nums of n integers where n > 1,
   return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

 Example:
 Input:  [1,2,3,4]
 Output: [24,12,8,6]
 Constraint: It's guaranteed that the product of the elements of any prefix or suffix
   of the array (including the whole array) fits in a 32 bit integer.

 Note: Please solve it without division and in O(n).

 Follow up:
 Could you solve it with constant space complexity?
 (The output array does not count as extra space for the purpose of space complexity analysis.)
 */

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length, div = 1, countNulls = 0;

        int[] result = new int[len], nulls = new int[len];

        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                nulls[i] = 1;
                countNulls++;
            } else {
                div *= nums[i];
            }
        }

        if (countNulls > 1) {
            return result;
        }

        if (countNulls == 1) {
            for (int i = 0; i < len; i++) {
                if (nulls[i] == 1) {
                    result[i] = div;
                    break;
                }
            }

            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = div / nums[i];
        }

        return result;
    }
}
