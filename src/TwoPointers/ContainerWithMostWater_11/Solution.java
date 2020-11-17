package TwoPointers.ContainerWithMostWater_11;

import java.lang.Math;

/**
 * 11. Container With Most Water
 * 
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0).
 * Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
 * 
 *  Input: heights = [1,8,6,2,5,4,8,3,7]
    Output: 49
    Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water, the container can contain is 49.

    leetcode link : https://leetcode.com/problems/container-with-most-water/
 *  */

class Solution {
  public int getContainerWithMostWater(int[] heights) {
    int l = 0;
    int r = heights.length - 1;
    int maxArea = 0;

    while (l < r) {
      int min = Math.min(heights[l], heights[r]);
      int curr = min * (r - l);
      maxArea = Math.max(maxArea, curr);

      if (heights[r] == heights[l]) {
        l++;
        r--;
      }
      else if (heights[l] < heights[r]) l++;
      else r--;
    }
    return maxArea;
  }
}