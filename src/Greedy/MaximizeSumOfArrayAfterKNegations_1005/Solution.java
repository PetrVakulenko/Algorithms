package Greedy.MaximizeSumOfArrayAfterKNegations_1005;

import java.util.Arrays;

/**
 1005. Maximize Sum Of Array After K Negations

 Given an array A of integers, we must modify the array in the following way: we choose an i and replace A[i] with
   -A[i], and we repeat this process K times in total.  (We may choose the same index i multiple times.)
 Return the largest possible sum of the array after modifying it in this way.

 Example 1:
 Input: A = [4,2,3], K = 1
 Output: 5
 Explanation: Choose indices (1,) and A becomes [4,-2,3].

 Example 2:
 Input: A = [3,-1,0,2], K = 3
 Output: 6
 Explanation: Choose indices (1, 2, 2) and A becomes [3,1,0,2].

 Example 3:
 Input: A = [2,-3,-1,5,-4], K = 2
 Output: 13
 Explanation: Choose indices (1, 4) and A becomes [2,3,-1,5,4].

 Note:
 1 <= A.length <= 10000
 1 <= K <= 10000
 -100 <= A[i] <= 100
 */

public class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);

        int sum = 0;

        for (int i = 1; i < A.length; i++) {
            if (K > 0) {
                if (A[i-1] < 0) {
                    if (A[i] < 0) {
                        A[i-1] *= -1;
                        K--;
                    } else if (A[i] == 0) {
                        A[i-1] *= -1;
                        K = 0;
                    } else {
                        boolean curr = K > 1;

                        K = K % 2;
                        if (K == 1) {
                            A[i-1] *= -1;
                        } else if (curr) {
                            if (Math.abs(A[i-1]) > A[i]) {
                                A[i-1] *= -1;
                                A[i] *= -1;
                            }
                        }
                        K--;
                    }
                } else if (A[i-1] == 0) {
                    K = 0;
                } else if (A[i-1] > 0) {
                    K = K % 2;
                    if (K == 1) {
                        A[i-1] *= -1;
                    }
                    K--;
                }
            }

            sum += A[i-1];
        }


        if (K > 0) {
            K = K % 2;
            if (K == 1) {
                A[A.length-1] *= -1;
            }
        }

        return sum + A[A.length - 1];
    }
}
