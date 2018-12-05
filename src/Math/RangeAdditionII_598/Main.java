package Math.RangeAdditionII_598;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        //int m = 3, n = 3;
        //int[][] arr1 = {{2,2},{3,3}};
        int m = 18, n = 3;
        int[][] arr1 = {{16,1},{14,3},{14,2},{4,1},{10,1},{11,1},{8,3},{16,2},{13,1},{8,3},{2,2},{9,1},{3,1},{2,2},{6,3}};
        System.out.println(s.maxCount(m, n, arr1));
    }
}
