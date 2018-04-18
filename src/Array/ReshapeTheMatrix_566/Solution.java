package Array.ReshapeTheMatrix_566;

public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if ((r >= nums.length && c >= nums[0].length) || nums.length == 0 || nums == null ){
            return nums;
        }

        int[][] result = new int[r][c];

        int k = 0, l = 0;
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                result[i][j] = nums[k][l++];
                if (l == nums[0].length){
                    k++;
                    l = 0;
                }
            }
        }

        return result;
    }
}
