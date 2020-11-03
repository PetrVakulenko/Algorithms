package Greedy.RemoveCoveredIntervals_1288;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 1288. Remove Covered Intervals

 Given a list of intervals, remove all intervals that are covered by another interval in the list.
 Interval [a,b) is covered by interval [c,d) if and only if c <= a and b <= d.
 After doing so, return the number of remaining intervals.

 Example 1:
 Input: intervals = [[1,4],[3,6],[2,8]]
 Output: 2
 Explanation: Interval [3,6] is covered by [2,8], therefore it is removed.

 Example 2:
 Input: intervals = [[1,4],[2,3]]
 Output: 1

 Example 3:
 Input: intervals = [[0,10],[5,12]]
 Output: 2

 Example 4:
 Input: intervals = [[3,10],[4,10],[5,11]]
 Output: 2

 Example 5:
 Input: intervals = [[1,2],[1,4],[3,4]]
 Output: 1

 Constraints:
 1 <= intervals.length <= 1000
 intervals[i].length == 2
 0 <= intervals[i][0] < intervals[i][1] <= 10^5
 All the intervals are unique.

 */

public class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        int count = 0;

        Arrays.sort(intervals , (a,b)->{ return a[0] - b[0]; });
        int beg = -1;
        int end = -1;
        int res = 0;
        for(int i=0 ; i<intervals.length ; i++){
            if(intervals[i][0] >beg && intervals[i][1]> end){
                beg = intervals[i][0];
                res++;
            }
            end = Math.max(end , intervals[i][1]);
        }

        return res;
    }
}
