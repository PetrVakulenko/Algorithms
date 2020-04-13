package HashTable.ContiguousArray_525;

import java.util.HashMap;
import java.util.Map;

/**
 525. Contiguous Array

 Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

 Example 1:
 Input: [0,1]
 Output: 2
 Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.

 Example 2:
 Input: [0,1,0]
 Output: 2
 Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.

 Note: The length of the given binary array will not exceed 50,000.
 */

public class Solution {
    public int findMaxLength(int[] nums) {
        int diff = 0, maxL = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            diff = nums[i] == 1 ? diff + 1 : diff - 1;
            if (map.containsKey(diff)) {
                maxL = Math.max(maxL, i - map.get(diff));
            } else {
                map.put(diff, i);
            }
        }

        return maxL;
    }
}
