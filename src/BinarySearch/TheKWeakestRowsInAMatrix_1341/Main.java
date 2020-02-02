package BinarySearch.TheKWeakestRowsInAMatrix_1341;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] A = {
                {1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}
            };
        Utils.PrintResult.printArray(s.kWeakestRows(A, 3));
    }
}
