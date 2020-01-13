package Array.CellsWithOddValuesInAMatrix_1252;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int n = 2, m = 3;
        int[][] indices = {{0, 1}, {1, 1}};

        System.out.println(s.oddCells(n,m,indices));
    }
}