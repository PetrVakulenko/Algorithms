package Array.PascalsTriangle_118;

import java.util.ArrayList;
import java.util.List;

/**
 118. Pascal's Triangle

 Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 In Pascal's triangle, each number is the sum of the two numbers directly above it.

 Example:
 Input: 5
 Output:
 [
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
 ]
 */

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList();
        if (numRows == 0) return result;

        List<Integer> prevRow = new ArrayList();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> tmp = new ArrayList();
            if (i <= 2) {
                tmp.add(1);
                if (i == 2) tmp.add(1);
                result.add(tmp);

                prevRow = tmp;
                continue;
            }

            tmp.add(1);
            for (int j = 1; j < i - 1; j++) {
                tmp.add(prevRow.get(j-1) + prevRow.get(j));
            }
            tmp.add(1);

            result.add(tmp);

            prevRow = tmp;
        }

        return result;
    }
}
