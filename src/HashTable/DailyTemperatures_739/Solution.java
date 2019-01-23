package HashTable.DailyTemperatures_739;

import java.util.Queue;
import java.util.LinkedList;

/**
 739. Daily Temperatures
 https://leetcode.com/problems/daily-temperatures/

 Given a list of daily temperatures T, return a list such that, for each day in the input,
    tells you how many days you would have to wait until a warmer temperature.
 If there is no future day for which this is possible, put 0 instead.

 For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73],
    your output should be [1, 1, 4, 2, 1, 1, 0, 0].

 Note:
 The length of temperatures will be in the range [1, 30000].
 Each temperature will be an integer in the range [30, 100].
 */

public class Solution {
    public int[] dailyTemperatures(int[] T) {
        int i, j, tmp;
        int[] result = new int[T.length];
        result[T.length-1] = 0;

        for (i = T.length-2; i >= 0; i--) {
            tmp = i;
            for (j = i+1; j < T.length; j++) {
                if (T[j] > T[i]) {
                    tmp = j;
                    break;
                }
            }
            result[i] = tmp-i;
        }

        return result;
    }
}
