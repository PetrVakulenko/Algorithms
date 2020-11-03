package Greedy.MinimumDominoRotationsForEqualRow_1007;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] A = {2,1,2,4,2,2}, B = {5,2,6,2,3,2};

        System.out.println(s.minDominoRotations(A, B));
    }
}
