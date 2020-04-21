package Depth_first_Search.FloodFill_733;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[][] image = {{0,0,0},{0,1,1}};

        Utils.PrintResult.printMatrix(s.floodFill(image, 1, 1, 2));
    }
}
