package Math.MaximumProductOfThreeNumbers_628;

import java.util.*;

/**
 628. Maximum Product of Three Numbers
 https://leetcode.com/problems/maximum-product-of-three-numbers/description/

 Given an integer array, find three numbers whose product is maximum and output the maximum product.

 Example 1:
 Input: [1,2,3]
 Output: 6

 Example 2:
 Input: [1,2,3,4]
 Output: 24

 Note:
 The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
 Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.
 */

public class Solution {
    public int maximumProduct(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        for(int i=0; i < nums.length; i++){
            int num = nums[i];
            if(num >= largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = num;
            } else if(num >= secondLargest){
                thirdLargest = secondLargest;
                secondLargest = num;
            } else if (num >= thirdLargest){
                thirdLargest = num;
            }

            if(num <= smallest){
                secondSmallest = smallest;
                smallest = num;
            } else if(num <= secondSmallest){
                secondSmallest = num;
            }
        }
        return Math.max((largest*secondLargest*thirdLargest), (smallest*secondSmallest*largest));
    }
}
