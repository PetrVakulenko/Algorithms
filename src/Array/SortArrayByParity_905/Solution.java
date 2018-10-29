package Array.SortArrayByParity_905;

import java.util.ArrayList;
import java.util.List;

/**
 905. Sort Array By Parity
 https://leetcode.com/problems/sort-array-by-parity/description/

 Given an array A of non-negative integers.
 Return an array consisting of all the even elements of A, followed by all the odd elements of A.
 You may return any answer array that satisfies this condition.

 Example 1:
 Input: [3,1,2,4]
 Output: [2,4,3,1]
 The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

 Note:
 1 <= A.length <= 5000
 0 <= A[i] <= 5000
 */
public class Solution {
    public int[] SortArrayByParity1(int[] A) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0; i < A.length; i++){
            if ((A[i] % 2) == 0) {
                list1.add(A[i]);
            } else {
                list2.add(A[i]);
            }
        }

        list1.addAll(list2);

        return list1.stream().mapToInt(i->i).toArray();
    }

    public int[] SortArrayByParity(int[] A) {
        int i = 0, j = A.length-1;

        while(i < j){
            if(A[i]%2 >= A[j]%2){
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
            if(A[i]%2 == 0)i++;
            if(A[j]%2 == 1)j--;
        }

        return A;
    }
}
