package DynamicProgramming.MimimumPathSum_64;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] nums = {
            {1,3,1},
            {1,5,1},
            {4,2,1}
        };
        System.out.println(s.minPathSum(nums));
    }
}
