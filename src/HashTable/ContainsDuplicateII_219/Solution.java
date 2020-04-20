package HashTable.ContainsDuplicateII_219;

import java.util.Arrays;
import java.util.HashMap;

/**
 219. Contains Duplicate II

 Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array
 such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

 Example 1:
 Input: nums = [1,2,3,1], k = 3
 Output: true

 Example 2:
 Input: nums = [1,0,1,1], k = 1
 Output: true

 Example 3:
 Input: nums = [1,2,3,1,2,3], k = 2
 Output: false
 */

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> minIndexes = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if (minIndexes.containsKey(nums[i])) {
                if (i - minIndexes.get(nums[i]) <= k) return true;
            }

            minIndexes.put(nums[i], i);
        }

        return false;
    }
}
