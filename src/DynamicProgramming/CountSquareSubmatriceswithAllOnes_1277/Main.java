package DynamicProgramming.CountSquareSubmatriceswithAllOnes_1277;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] matrix = {
                {0,1,1,1},
                {1,1,1,1},
                {0,1,1,1}
        };
        System.out.println(s.countSquares(matrix));
    }
}
