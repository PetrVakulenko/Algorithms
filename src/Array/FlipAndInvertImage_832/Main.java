package Array.FlipAndInvertImage_832;

import Utils.PrintResult;

public class Main {
    public static void main(String[] argv){
        Solution s = new Solution();

        int[][] array = {{1,1,0},{1,0,1},{0,0,0}};
        PrintResult.printMatrix(array);

        int[][] result = s.SortArrayByParity(array);
        PrintResult.printMatrix(result);
    }
}
