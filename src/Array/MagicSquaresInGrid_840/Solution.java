package Array.MagicSquaresInGrid_840;

/**
 840. Magic Squares In Grid

 A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers from 1 to 9 such that each row, column, and both diagonals all have the same sum.
 Given an grid of integers, how many 3 x 3 "magic square" subgrids are there?  (Each subgrid is contiguous).

 Example 1:
 Input: [[4,3,8,4],
 [9,5,1,9],
 [2,7,6,2]]
 Output: 1
 Explanation:
 The following subgrid is a 3 x 3 magic square:
 438
 951
 276

 while this one is not:
 384
 519
 762

 In total, there is only one magic square inside the given grid.

 Note:
 1 <= grid.length <= 10
 1 <= grid[0].length <= 10
 0 <= grid[i][j] <= 15
 */

public class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        if (rows < 3 || cols < 3) return 0;
        int count = 0;
        for (int i=0;i<rows-2;i++) {
            for (int j=0;j<cols-2;j++) {
                if(isMagicGrid(grid,i, j)) count++;
            }
        }
        return count;
    }


    public boolean isMagicGrid(int[][] grid,int rowStart,int colStart) {
        int diagonalsSum = 0;
        int antiDiagonalSum = 0;
        int[] rowsSum = new int[3];
        int[] colsSum = new int[3];
        int[] numbers = new int[9];
        for (int i = rowStart,row =0; i < rowStart + 3; i++,row++) {
            for (int j = colStart,col=0; j < colStart + 3; j++,col++) {
                if(grid[i][j] > 9 || grid[i][j] < 1) return false;
                rowsSum[i%3] += grid[i][j];
                colsSum[j%3] += grid[i][j];
                if(numbers[grid[i][j]-1] == 0) {
                    numbers[grid[i][j]-1]++;
                } else {
                    return false;
                }
                if (row == col) diagonalsSum += grid[i][j];
                if ((3 - row - 1) == col) antiDiagonalSum += grid[i][j];
            }
        }
        if(diagonalsSum != antiDiagonalSum) return false;
        boolean isRowsEqual = rowsSum[0] == rowsSum[1]  && rowsSum[1] == rowsSum[2];
        boolean isColsEqual = colsSum[0] == colsSum[1]  && colsSum[1] == colsSum[2];
        return isRowsEqual && isColsEqual;
    }
}
