package Array.MonotonicArray_896;

/**
 896. Monotonic Array
 https://leetcode.com/problems/monotonic-array/description/

 An array is monotonic if it is either monotone increasing or monotone decreasing.
 An array A is monotone increasing if for all i <= j, A[i] <= A[j].
 An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
 Return true if and only if the given array A is monotonic.

 Example 1:
 Input: [1,2,2,3]
 Output: true

 Example 2:
 Input: [6,5,4,4]
 Output: true

 Example 3:
 Input: [1,3,2]
 Output: false

 Example 4:
 Input: [1,2,4,5]
 Output: true

 Example 5:
 Input: [1,1,1]
 Output: true
 */

public class Solution {
    public boolean isMonotonic(int[] A) {
        int len = A.length, i, type = 0;
        if (len <= 2) {
            return true;
        }

        for(i = 1; i < len; i++) {
            if (A[i] == A[i-1]) continue;

            if (A[i] < A[i-1] && type != 2) {
                type = 1;
            } else if (A[i] > A[i-1] && type != 1) {
                type = 2;
            } else {
                return false;
            }
        }

        return true;
    }
}
