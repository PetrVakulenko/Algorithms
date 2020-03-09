package Sort.MatrixCellsInDistanceOrder_1030;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;

/**
 1030. Matrix Cells in Distance Order

 We are given a matrix with R rows and C columns has cells with integer coordinates (r, c),
    where 0 <= r < R and 0 <= c < C.
 Additionally, we are given a cell in that matrix with coordinates (r0, c0).
 Return the coordinates of all cells in the matrix, sorted by their distance from (r0, c0) from
    smallest distance to largest distance.  Here, the distance between two cells (r1, c1) and (r2, c2) is the
    Manhattan distance, |r1 - r2| + |c1 - c2|.  (You may return the answer in any order that satisfies this condition.)

 Example 1:
 Input: R = 1, C = 2, r0 = 0, c0 = 0
 Output: [[0,0],[0,1]]
 Explanation: The distances from (r0, c0) to other cells are: [0,1]

 Example 2:
 Input: R = 2, C = 2, r0 = 0, c0 = 1
 Output: [[0,1],[0,0],[1,1],[1,0]]
 Explanation: The distances from (r0, c0) to other cells are: [0,1,1,2]
 The answer [[0,1],[1,1],[0,0],[1,0]] would also be accepted as correct.

 Example 3:
 Input: R = 2, C = 3, r0 = 1, c0 = 2
 Output: [[1,2],[0,2],[1,1],[0,1],[1,0],[0,0]]
 Explanation: The distances from (r0, c0) to other cells are: [0,1,1,2,2,3]
 There are other answers that would also be accepted as correct, such as [[1,2],[1,1],[0,2],[1,0],[0,1],[0,0]].
 */

public class Solution {
    public int[][] allCellsDistOrder1(int R, int C, int r0, int c0) {
        int[][] result = new int[R*C][2];
        int[][] tmp = new int[R][C];

        tmp[r0][c0] = 1;
        result[0] = new int[]{r0, c0};

        int index = 0;

        Map<Integer, Integer> map = new HashMap();
        map.put(r0, c0);

        while(map.size() > 0)
        {
            Map<Integer, Integer> tempMap = new HashMap();

            for(int i: map.keySet())
            {
                int j = map.get(i);

                if (i > 0 && tmp[i-1][j] == 0) {
                    tempMap.put(i-1, j);
                    result[++index] = new int[]{i-1, j};
                    tmp[i-1][j] = 1;
                }

                if (i < R-1 && tmp[i+1][j] == 0) {
                    tempMap.put(i+1, j);
                    result[++index] = new int[]{i+1, j};
                    tmp[i+1][j] = 1;
                }

                if (j > 0 && tmp[i][j-1] == 0) {
                    tempMap.put(i, j-1);
                    result[++index] = new int[]{i, j-1};
                    tmp[i][j-1] = 1;
                }

                if (j < C - 1 && tmp[i][j+1] == 0) {
                    tempMap.put(i, j+1);
                    result[++index] = new int[]{i, j+1};
                    tmp[i][j+1] = 1;
                }
            }

            map = tempMap;
        }

        return result;

    }

    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] ans = new int[R * C][2];
        int length = 0;
        ans[0] = new int[]{r0, c0};
        int maxDis = Math.max(r0, R - 1 - r0) + Math.max(c0, C - 1 - c0);
        for(int i = 0; i <= maxDis; i++){
            for(int j = 0; j < i; j++){
                if(r0 + i - j < R && c0 + j < C){
                    ans[++length] = new int[]{r0 + i - j, c0 + j};
                }

                if(r0 - j >= 0 && c0 + i - j < C){
                    ans[++length] = new int[]{r0 - j, c0 + i - j};
                }

                if(r0 - i + j >= 0 && c0 - j >= 0){
                    ans[++length] = new int[]{r0 - i + j, c0 - j};
                }

                if(r0 + j < R && c0 - i + j >= 0){
                    ans[++length] = new int[]{r0 + j, c0 - i + j};
                }
            }
        }
        return ans;
    }
}