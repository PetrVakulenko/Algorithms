package Array.JumpGame_55;

/**
 55. Jump Game

 Given an array of non-negative integers, you are initially positioned at the first index of the array.
 Each element in the array represents your maximum jump length at that position.
 Determine if you are able to reach the last index.

 Example 1:
 Input: [2,3,1,1,4]
 Output: true
 Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

 Example 2:
 Input: [3,2,1,0,4]
 Output: false
 Explanation: You will always arrive at index 3 no matter what. Its maximum
 jump length is 0, which makes it impossible to reach the last index.
 */

public class Solution {
    public boolean canJump(int[] nums) {
        int i = nums.length - 2;
        while(i>=0) {
            if(nums[i] == 0) {
                int j = i-1;
                while(j>=0 && nums[j] <= i-j) {
                    j--;
                }
                if(j<0) return false;
                i = j;
            } else {
                i--;
            }
        }
        return true;
    }
}
