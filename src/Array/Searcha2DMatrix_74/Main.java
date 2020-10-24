package Array.Searcha2DMatrix_74;

public class Main {
    public static void main(String[] argv){
        Solution s = new Solution();
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int target = 3;
        System.out.println((s.searchMatrix(matrix, target)));
    }
}
