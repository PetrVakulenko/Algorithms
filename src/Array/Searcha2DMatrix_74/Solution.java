package Array.Searcha2DMatrix_74;

/**
 74. Search a 2D Matrix

 Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 Integers in each row are sorted from left to right.
 The first integer of each row is greater than the last integer of the previous row.

 Example 1:
 Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,50]], target = 3
 Output: true

 Example 2:
 Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,50]], target = 13
 Output: false

 Example 3:
 Input: matrix = [], target = 0
 Output: false

 Constraints:
 m == matrix.length
 n == matrix[i].length
 0 <= m, n <= 100
 -104 <= matrix[i][j], target <= 104
 */

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;

        if (rows == 0) return false;

        int cols = matrix[0].length;

        if (cols == 0) return false;

        for (int i = 0; i < rows; i++) {
            if (i == rows - 1) {
                if (matrix[i][cols - 1] < target) return false;

                return checkRow(matrix[i], target);
            }

            if (matrix[i + 1][0] > target && matrix[i][0] <= target) {
                return checkRow(matrix[i], target);
            }
        }

        return false;
    }

    private boolean checkRow(int[] row, int target) {
        for (int j = 0; j < row.length; j++) {
            if (target == row[j]) return true;

            if (target < row[j]) return false;
        }

        return false;
    }
}
