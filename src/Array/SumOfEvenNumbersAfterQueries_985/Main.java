package Array.SumOfEvenNumbersAfterQueries_985;

public class Main {
    public static void main(String[] argv){
        Solution s = new Solution();
        int[] A = {1,2,3,4};
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
        Utils.PrintResult.printArray(s.sumEvenAfterQueries(A, queries));
    }
}
