package Array.FindAllNumbersDisappearedInAnArray_448;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 442. Find All Duplicates in an Array
 https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

 Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 Find all the elements that appear twice in this array.
 Could you do it without extra space and in O(n) runtime?

 Example:
 Input: [4,3,2,7,8,2,3,1]
 Output: [2,3]
 */

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]) {
                int tmp = nums[i];
                nums[i] = nums[tmp - 1];
                nums[tmp - 1] = tmp;
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
