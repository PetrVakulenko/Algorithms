package Array.CountNegativeNumbersInASortedMatrix_1351;

/**
 1351. Count Negative Numbers in a Sorted Matrix

 Given a m * n matrix grid which is sorted in non-increasing order both row-wise and column-wise.
 Return the number of negative numbers in grid.

 Example 1:
 Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
 Output: 8
 Explanation: There are 8 negatives number in the matrix.

 Example 2:
 Input: grid = [[3,2],[1,0]]
 Output: 0

 Example 3:
 Input: grid = [[1,-1],[-1,-1]]
 Output: 3

 Example 4:
 Input: grid = [[-1]]
 Output: 1
 */

class Solution {
    public int countNegatives(int[][] grid) {
        int result = 0, i, j, k, m = grid.length, n = grid[0].length;
        for (i = 0; i < m; i++) {
            j = -1; k = n;

            do {
                j++;
                k--;

                if (grid[i][j] < 0) {
                    result += n - j;
                    break;
                }

                if (grid[i][k] >= 0) {
                    result += n - k - 1;
                    break;
                }
            } while (j < k);
        }

        return result;
    }
}