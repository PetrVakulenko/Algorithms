package Array.FindAllDuplicatesInAnArray_442;

import java.util.ArrayList;
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
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int[] arr = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            if(arr[nums[i]] != 0){
                res.add(nums[i]);
            }else{
                arr[nums[i]]++;
            }
        }
        return res;
    }
}
