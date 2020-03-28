package Array.LuckyNumbersInAMatrix_1380;

import java.util.ArrayList;
import java.util.List;

/**
 1380. Lucky Numbers in a Matrix

 Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
 A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

 Example 1:
 Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
 Output: [15]
 Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column

 Example 2:
 Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
 Output: [12]
 Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.

 Example 3:
 Input: matrix = [[7,8],[1,2]]
 Output: [7]

 Constraints:
 m == mat.length
 n == mat[i].length
 1 <= n, m <= 50
 1 <= matrix[i][j] <= 10^5.
 All elements in the matrix are distinct.
 */

public class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] minimumFromRows = new int[m];

        List<Integer> result = new ArrayList();

        for (int i = 0; i < m; i++) {
            int min = matrix[i][0];
            int jMin = 0;

            if (n > 1) {
                for (int j = 1; j < n; j++) {
                    if (matrix[i][j] < min) {
                        min = matrix[i][j];
                        jMin = j;
                    }
                }
            }

            int max = matrix[0][jMin];

            if (m > 1) {
                for (int k = 1; k < m; k++) {
                    if (matrix[k][jMin] > max) {
                        max = matrix[k][jMin];
                    }
                }
            }

            if (max == min) {
                result.add(max);
            }
        }

        return result;
    }
}
