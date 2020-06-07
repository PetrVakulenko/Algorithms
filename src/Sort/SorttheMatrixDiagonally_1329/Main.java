package Sort.SorttheMatrixDiagonally_1329;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[][] matrix = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};

        System.out.println(Arrays.toString(s.diagonalSort(matrix)));
    }
}