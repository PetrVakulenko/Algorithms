package Array.HeightChecker_1051;

import java.util.Arrays;

/**
 1051. Height Checker

 Students are asked to stand in non-decreasing order of heights for an annual photo. Return the minimum number
   of students that must move in order for all students to be standing in non-decreasing order of height.

 Example 1:
 Input: heights = [1,1,4,2,1,3]
 Output: 3

 Constraints:
 1 <= heights.length <= 100
 1 <= heights[i] <= 100
 */

public class Solution {
    public int heightChecker(int[] heights) {
        int [] heights2 = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights2);

        int count=0, i;

        for(i = 0; i < heights.length; i++)
        {
            if(heights[i]!= heights2[i])
                count++;
        }

        return count;
    }
}
