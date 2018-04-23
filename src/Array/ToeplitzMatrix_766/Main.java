package Array.ToeplitzMatrix_766;

public class Main {
    public static void main(String[] argv){
        Solution s = new Solution();
        //int[][] matrix = {{11,74,0,93},{40,11,74,7}};//{{0,1,2,3},{1,0,1,2},{2,1,0,1},{3,2,1,0}};
        //int[][] matrix = {{41,45},{81,41},{73,81},{47,73},{0,47},{79,76}};
        int[][] matrix = {{11,74,0,93},{40,11,74,7}};
        System.out.println(s.isToeplitzMatrix(matrix));
    }
}
