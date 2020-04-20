package Array.ImageSmoother_661;

public class Main {
    public static void main(String[] argv){
        Solution s = new Solution();
        int[][] matrix = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };

        Utils.PrintResult.printMatrix(s.imageSmoother(matrix));
    }
}
