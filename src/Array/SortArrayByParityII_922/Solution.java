package Array.SortArrayByParityII_922;

/**
 922. Sort Array By Parity II
 https://leetcode.com/problems/sort-array-by-parity-ii/description/

 Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
 Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
 You may return any answer array that satisfies this condition.

 Example 1:
 Input: [4,2,5,7]
 Output: [4,5,2,7]
 Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.


 Note:
 2 <= A.length <= 20000
 A.length % 2 == 0
 0 <= A[i] <= 1000
 */
public class Solution {
    public int[] SortArrayByParityII(int[] A) {
        int i = 0, j = 1, n = A.length;
        int tmp;

        while (i < n && j < n) {
            while(i < n && A[i] % 2 == 0){
                i += 2;
            }
            while(j < n && A[j] % 2 == 1){
                j += 2;
            }
            if(i < n && j < n){
                tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        }

        return A;
    }

    public int[] SortArrayByParityII_1(int[] A) {
        int i = 0, j = A.length;
        int tmpIndex, tmp;

        for(i = 0; i < j; i++) {
            if (i % 2 == 0 && A[i]%2 == 1) {
                boolean check = true;
                tmpIndex = i;
                do {
                    i++;
                    if (i % 2 == 1 && A[i]%2 == 0) check = false;
                } while(check);

                tmp = A[tmpIndex];
                A[tmpIndex] = A[i];
                A[i] = tmp;

                i = tmpIndex;
            }

            if (i % 2 == 1 && A[i]%2 == 0) {
                boolean check = true;
                tmpIndex = i;
                do {
                    i++;
                    if (i % 2 == 0 && A[i]%2 == 1) check = false;
                } while(check);

                tmp = A[tmpIndex];
                A[tmpIndex] = A[i];
                A[i] = tmp;

                i = tmpIndex;
            }
        }

        return A;
    }
}
