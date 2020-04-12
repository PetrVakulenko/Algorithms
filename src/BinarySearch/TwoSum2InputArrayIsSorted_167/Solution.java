package BinarySearch.TwoSum2InputArrayIsSorted_167;

import java.util.HashMap;

/**
 167. Two Sum II - Input array is sorted

 Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

 Note:
 Your returned answers (both index1 and index2) are not zero-based.
 You may assume that each input would have exactly one solution and you may not use the same element twice.

 Example:
 Input: numbers = [2,7,11,15], target = 9
 Output: [1,2]
 Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */

class Solution {
    public int[] twoSum(int[] numbers, int target) { //O(n) O(1)
        int[] ans = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                ans[0] = i + 1;
                ans[1] = j + 1;
                return ans;
            }
            if (sum < target) i++;
            else j--;
        }
        return ans;
    }

    public int[] twoSum1(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap();

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                int[] ar = {map.get(target - numbers[i]) + 1, i + 1};
                return ar;
            }

            map.put(numbers[i], i);
        }

        return null;
    }
}