package Math.KClosestPointsToOrigin_973;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String diString = "AB";
        int[][] points = {{1,3},{-2,2}};
        int k = 1;
        System.out.println(Arrays.toString(s.kClosest(points, k)));
    }
}
