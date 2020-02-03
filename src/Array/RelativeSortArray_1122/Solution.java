package Array.RelativeSortArray_1122;

import java.util.Arrays;

/**
 1122. Relative Sort Array

 Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
 Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.
 Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.

 Example 1:
 Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 Output: [2,2,2,1,4,3,3,9,6,7,19]

 Constraints:
 arr1.length, arr2.length <= 1000
 0 <= arr1[i], arr2[i] <= 1000
 Each arr2[i] is distinct.
 Each arr2[i] is in arr1.
 */

public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];

        Arrays.sort(arr1);

        int tmp, index = 0, j, i;

        j = 0;

        for (i = 0; i < arr2.length; i++) {
            for (j = 0; j < arr1.length; j++) {
                tmp = arr1[j];

                if (arr2[i] == tmp) {
                    result[index++] = tmp;

                    arr1[j] = -1;

                    if (j == arr1.length - 1 || tmp != arr1[j+1]) {
                        break;
                    }
                }
            }
        }

        for (i = 0; i < arr1.length; i++) {
            if (arr1[i] != -1) {
                result[index++] = arr1[i];
            }
        }

        return result;
    }
}
