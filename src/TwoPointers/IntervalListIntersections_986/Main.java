package TwoPointers.IntervalListIntersections_986;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[][] A = {{0,2},{5,10},{13,23},{24,25}}, B = {{1,5},{8,12},{15,24},{25,26}};

        Utils.PrintResult.printMatrix(s.intervalIntersection(A, B));
    }
}