package Array.ReplaceElementsWithGreatestElementOnRightSide_1299;

/**
 1299. Replace Elements with Greatest Element on Right Side

 Given an array arr, replace every element in that array with the greatest element among the elements to its right,
    and replace the last element with -1.
 After doing so, return the array.

 Example 1:
 Input: arr = [17,18,5,4,6,1]
 Output: [18,6,6,6,1,-1]

 Constraints:
 1 <= arr.length <= 10^4
 1 <= arr[i] <= 10^5
 */

public class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length - 1, max = arr[len], tmp, i;

        arr[len] = -1;

        for (i = len - 1; i >= 0; i--) {
            if (arr[i] > max) {
                tmp = max;
                max = arr[i];
                arr[i] = tmp;
            } else {
                arr[i] = max;
            }
        }

        return arr;
    }
}
