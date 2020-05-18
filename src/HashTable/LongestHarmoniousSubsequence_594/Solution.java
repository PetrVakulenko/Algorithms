package HashTable.LongestHarmoniousSubsequence_594;

/**
 594. Longest Harmonious Subsequence

 We define a harmounious array as an array where the difference between its maximum value and its minimum value is exactly 1.
 Now, given an integer array, you need to find the length of its longest harmonious subsequence among all its possible subsequences.

 Example 1:
 Input: [1,3,2,2,5,2,3,7]
 Output: 5
 Explanation: The longest harmonious subsequence is [3,2,2,2,3].

 Note: The length of the input array will not exceed 20,000.
 */

class Solution {
    public int findLHS(int[] nums) {
        int count, max = 0; boolean tickOff = false;

        for (int num1 : nums){
            count = 0;
            for (int num2 : nums){
                if (num1 != num2){
                    if (num2 - num1 == 1){
                        count++;
                        tickOff = true;
                    }
                }
                else
                    count++;
            }
            if (count > max && tickOff)
                max = count;
            tickOff = false;
        }

        return max;
    }
}