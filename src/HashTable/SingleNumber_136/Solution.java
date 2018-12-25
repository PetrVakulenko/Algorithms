package HashTable.SingleNumber_136;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 136. Single Number
 https://leetcode.com/problems/single-number/

 Given a non-empty array of integers, every element appears twice except for one. Find that single one.

 Note:
 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

 Example 1:
 Input: [2,2,1]
 Output: 1

 Example 2:
 Input: [4,1,2,1,2]
 Output: 4
 */

public class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        int dup = nums[0];
        for(int i = 1; i < len; i++){
            dup^=nums[i];
            System.out.println(dup);
        }
        return dup;

//        HashMap<Integer, Integer> vis = new HashMap<>();
//        for (int num : nums) {
//            if (vis.containsKey(num)){
//                vis.put(num, vis.get(num) + 1);
//            } else {
//                vis.put(num, 1);
//            }
//        }
//
//        System.out.println(vis);
//
//        for(int key: vis.keySet()) {
//            if (vis.get(key) == 1) {
//                return key;
//            }
//        }
//
//        return -1;
    }
}
