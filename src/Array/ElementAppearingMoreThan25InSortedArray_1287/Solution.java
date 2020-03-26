package Array.ElementAppearingMoreThan25InSortedArray_1287;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 1287. Element Appearing More Than 25% In Sorted Array

 Given an integer array sorted in non-decreasing order,
    there is exactly one integer in the array that occurs more than 25% of the time.
 Return that integer.

 Example 1:
 Input: arr = [1,2,2,6,6,6,6,7,10]
 Output: 6

 Constraints:
 1 <= arr.length <= 10^4
 0 <= arr[i] <= 10^5
 */

public class Solution {
    public int findSpecialInteger(int[] arr) {
        int count = 1, amount = arr.length / 4, i;

        for (i = 1; i < arr.length; i++) {
            count = arr[i] != arr[i-1] ? 1 : count + 1;

            if (count > amount) {
                return arr[i];
            }
        }

        return arr[0];
    }
}
