package Math.LargestTriangleArea_812;

/**
 812. Largest Triangle Area

 You have a list of points in the plane. Return the area of the largest triangle that can be formed by any 3 of the points.

 Example:
 Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
 Output: 2
 Explanation:
 The five points are show in the figure below. The red triangle is the largest.

 Notes:
 3 <= points.length <= 50.
 No points will be duplicated.
 -50 <= points[i][j] <= 50.
 Answers within 10^-6 of the true value will be accepted as correct.
 */

public class Solution {
    public double largestTriangleArea(int[][] points) {
        double maxArea = 0;

        for (int i = 0; i < points.length; i++) {
            for (int j = i+1; j < points.length; j++) {
                for (int k = j+1; k < points.length; k++) {
                    maxArea = Math.max(maxArea, this.area(points[i], points[j], points[k]));
                }
            }
        }

        return maxArea;
    }

    private double area(int[] p, int[] q, int[] k) {
        return Math.abs(0.5 * ((p[0] * q[1] + q[0] * k[1] + k[0] * p[1]) - (p[0] * k[1] + q[1] * k[0] + p[1] * q[0])));
    }
}
