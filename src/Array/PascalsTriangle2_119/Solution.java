package Array.PascalsTriangle2_119;

import java.util.ArrayList;
import java.util.List;

/**
 119. Pascal's Triangle 2

 Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 Note that the row index starts from 0.

 Example:

 Input: 3
 Output: [1,3,3,1]
 */

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prevRow = new ArrayList();

        for (int i = 1; i <= rowIndex + 1; i++) {
            List<Integer> tmp = new ArrayList();
            if (i <= 2) {
                tmp.add(1);
                if (i == 2) tmp.add(1);

                prevRow = tmp;
                continue;
            }

            tmp.add(1);
            for (int j = 1; j < i - 1; j++) {
                tmp.add(prevRow.get(j-1) + prevRow.get(j));
            }
            tmp.add(1);

            if (i == rowIndex + 1) {
                return tmp;
            }

            prevRow = tmp;
        }

        return prevRow;
    }
}
