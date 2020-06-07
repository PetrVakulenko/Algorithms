package Sort.SorttheMatrixDiagonally_1329;

/**
 1329. Sort the Matrix Diagonally

 Given a m * n matrix mat of integers, sort it diagonally in ascending order from the top-left to the bottom-right then return the sorted array.

 Example 1:

 Input: mat = [[3,3,1,1],[2,2,1,2],[1,1,1,2]]
 Output: [[1,1,1,1],[1,2,2,2],[1,2,3,3]]

 Constraints:
 m == mat.length
 n == mat[i].length
 1 <= m, n <= 100
 1 <= mat[i][j] <= 100
 */

public class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length, n = mat[0].length;

        int[] arr = new int[101];
        for (int i = 0; i < m; i++) {
            sort(arr, mat, i, 0);
        }
        for (int j = 1; j < n; j++) {
            sort(arr, mat, 0, j);
        }
        return mat;
    }

    private void sort(int[] arr, int[][] mat, int x, int y) {
        int i = x, j = y;
        while (isOk(i, j, mat.length, mat[0].length)) {
            arr[mat[i++][j++]]++;
        }

        for (int k = 0; k < arr.length; k++) {
            while (arr[k] > 0) {
                mat[x++][y++] = k;
                arr[k]--;
            }
        }
    }

    private boolean isOk(int x, int y, int m, int n) {
        return x < m && y < n;
    }
}