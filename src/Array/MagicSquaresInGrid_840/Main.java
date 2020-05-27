package Array.MagicSquaresInGrid_840;

public class Main {
    public static void main(String[] argv){
        Solution s = new Solution();
        int[][] arr = {
                {4,3,8,4},
                {9,5,1,9},
                {2,7,6,2}
        };
        System.out.println(s.numMagicSquaresInside(arr));
    }
}
