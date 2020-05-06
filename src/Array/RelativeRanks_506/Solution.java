package Array.RelativeRanks_506;

import java.util.Arrays;
import java.util.HashMap;

/**
 506. Relative Ranks

 Given scores of N athletes, find their relative ranks and the people with the top three highest scores,
   who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

 Example 1:
 Input: [5, 4, 3, 2, 1]
 Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal".
 For the left two athletes, you just need to output their relative ranks according to their scores.

 Note:
 N is a positive integer and won't exceed 10,000.
 All the scores of athletes are guaranteed to be unique.
 */

public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int len = nums.length;

        int[] copyNums = Arrays.copyOf(nums, len);
        Arrays.sort(copyNums);
        HashMap<Integer, String> map = new HashMap();

        for (int i = len-1; i >= 0; i--) {
            if (i == len - 1) map.put(copyNums[i], "Gold Medal");
            if (i == len - 2) map.put(copyNums[i], "Silver Medal");
            if (i == len - 3) map.put(copyNums[i], "Bronze Medal");
            if (i < len-3) map.put(copyNums[i], String.valueOf(len - i));
        }

        String[] result = new String[len];

        for (int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]);
        }

        return result;
    }
}
