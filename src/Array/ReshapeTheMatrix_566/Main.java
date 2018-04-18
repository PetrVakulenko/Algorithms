package Array.ReshapeTheMatrix_566;

import java.util.Arrays;

public class Main {
    public static void main(String[] argv){
        Solution s = new Solution();
        int[][] matr = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        System.out.println(Arrays.toString(s.matrixReshape(matr,r,c)));
    }
}
