package BinarySearch.IntersectionOfTwoArrays_349;

import java.util.*;

/**
 349. Intersection of Two Arrays
 https://leetcode.com/problems/intersection-of-two-arrays/description/

 Given two arrays, write a function to compute their intersection.

 Example 1:
 Input: nums1 = [1,2,2,1], nums2 = [2,2]
 Output:

 Example 2:
 Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 Output: [9,4]

 Note:
 Each element in the result must be uni
 */

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;

        if (len1 < 1) {
            return nums1;
        }
        if (len2 < 1) {
            return nums2;
        }

        Arrays.sort(nums1);

        Set<Integer> result = new HashSet<Integer>();

        int i, len = nums2.length;

        for(i = 0; i < len; i++) {
            if (binarySearch(nums1, nums2[i])) {
                result.add(nums2[i]);
            }
        }

        int[] res = new int[result.size()];
        int c = 0;
        for(int x : result) res[c++] = x;

        return res;
    }

    private boolean binarySearch(int[] A, int num)
    {
        int mid, left = 0, right = A.length - 1;

        while (true)
        {
            mid = left + (right - left) / 2;

            if (A[mid] == num) {
                return true;
            }

            if (left == right) {
                return false;
            }

            if (A[mid] < num) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
    }
}
