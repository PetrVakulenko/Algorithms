package Array.DecompressRunLengthEncodedList_1313;

/**
 1313. Decompress Run-Length Encoded List

 We are given a list nums of integers representing a list compressed with run-length encoding.
 Consider each adjacent pair of elements [a, b] = [nums[2*i], nums[2*i+1]] (with i >= 0).
 For each such pair, there are a elements with value b in the decompressed list.
 Return the decompressed list.

 Example 1:
 Input: nums = [1,2,3,4]
 Output: [2,4,4,4]

 Constraints:
 2 <= nums.length <= 100
 nums.length % 2 == 0
 1 <= nums[i] <= 100
 */

class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len = nums.length;
        int len1=0;

        for(int i = 0; i < len; i = i + 2){
            len1 = len1 + nums[i];
        }

        int result [] = new int[len1];
        int j=0;

        for(int i = 0; i < len; i = i + 2){
            int count = nums[i];
            int num = nums[i + 1];
            int k = 0;
            while(j < len1 && k < count){
                result[j] = num;
                k++;
                j++;
            }
        }

        return result;
    }
}