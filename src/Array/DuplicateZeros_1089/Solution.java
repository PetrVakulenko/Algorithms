package Array.DuplicateZeros_1089;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 1089. Duplicate Zeros

 Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
 Note that elements beyond the length of the original array are not written.
 Do the above modifications to the input array in place, do not return anything from your function.

 Example 1:
 Input: [1,0,2,3,0,4,5,0]
 Output: null
 Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

 Example 2:
 Input: [1,2,3]
 Output: null
 Explanation: After calling your function, the input array is modified to: [1,2,3]

 Note:
 1 <= arr.length <= 10000
 0 <= arr[i] <= 9
 */

public class Solution {
    public int[] duplicateZeros(int[] arr) {
        int n = arr.length, index = 0, current = 0;

        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            if (index < current) {

                list[current++] = arr[i];

                if (list[index] == 0) {
                    arr[i] = 0;
                    if (i < n - 1) {
                        list[current++] = arr[i+1];
                        arr[i+1] = 0;
                        i++;
                    }
                } else {
                    arr[i] = list[index];
                }
                index++;
                continue;
            }

            if (arr[i] == 0 && i != n - 1) {
                list[current++] = arr[i+1];
                arr[i+1] = 0;
                i++;
            }
        }

        return arr;
    }
}
