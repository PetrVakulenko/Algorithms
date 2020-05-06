package Geometry.CheckIfItIsaStraightLine_1232;

/**
 1232. Check If It Is a Straight Line

 You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point.
 Check if these points make a straight line in the XY plane.

 Example 1:
 Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
 Output: true

 Example 2:
 Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
 Output: false

 Constraints:
 2 <= coordinates.length <= 1000
 coordinates[i].length == 2
 -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
 coordinates contains no duplicate point.
 */

public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        double grad = slope(coordinates[0], coordinates[1]);
        for(int i = 2 ; i < coordinates.length-1 ; i++){
            if( grad != slope(coordinates[i], coordinates[i+1]))    return false;
        }
        return true;
    }
    public double slope(int []a, int []b){
        return ( (double)b[1] - (double)a[1])  / ((double)b[0] - (double)a[0]);
    }
}
