package BinarySearch.LeftmostColumnWithAtLeastAOne;

import Utils.BinaryMatrix;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 Leftmost Column with at Least a One

 A binary matrix means that all elements are 0 or 1.
 For each individual row of the matrix, this row is sorted in non-decreasing order.
 Given a row-sorted binary matrix binaryMatrix, return leftmost column index(0-indexed) with at least a 1 in it.
 If such index doesn't exist, return -1.
 You can't access the Binary Matrix directly.  You may only access the matrix using a BinaryMatrix interface:
 BinaryMatrix.get(x, y) returns the element of the matrix at index (x, y) (0-indexed).
 BinaryMatrix.dimensions() returns a list of 2 elements [n, m], which means the matrix is n * m.
 Submissions making more than 1000 calls to BinaryMatrix.get will be judged Wrong Answer.
 Also, any solutions that attempt to circumvent the judge will result in disqualification.
 For custom testing purposes you're given the binary matrix mat as input in the following four examples.
 You will not have access the binary matrix directly.

 Example 1:
 Input: mat = [[0,0],[1,1]]
 Output: 0

 Example 2:
 Input: mat = [[0,0],[0,1]]
 Output: 1

 Example 3:
 Input: mat = [[0,0],[0,0]]
 Output: -1

 Example 4:
 Input: mat = [[0,0,0,1],[0,0,1,1],[0,1,1,1]]
 Output: 1

 Constraints:
 1 <= mat.length, mat[i].length <= 100
 mat[i][j] is either 0 or 1.
 mat[i] is sorted in a non-decreasing way.
 */

public class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        int m = binaryMatrix.dimensions().get(0);
        int n = binaryMatrix.dimensions().get(1);

        int left = 0;
        int right = n;
        int currentM = (left + right) / 2;
        int found = -1;

        int[] visited = new int[n];

        for (int i = 0; i < n; i++) {
            if (visited[currentM] == 1) return found;

            int ones = 0;
            for (int j = 0; j < m; j++) {
                try {
                    if (binaryMatrix.get(j, currentM) == 1) {
                        ones++;
                        break;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }


            if (ones > 0) {
                right = currentM;
                if (found > currentM || found == -1) found = currentM;
            } else {
                left = currentM;
            }

            visited[currentM] = 1;
            currentM = (left + right) / 2;
        }

        return found;
    }
}
