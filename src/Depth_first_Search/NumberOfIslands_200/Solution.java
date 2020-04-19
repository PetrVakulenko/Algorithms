package Depth_first_Search.NumberOfIslands_200;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 200. Number of Islands

 Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
 An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 You may assume all four edges of the grid are all surrounded by water.

 Example 1:
 Input:
 11110
 11010
 11000
 00000

 Output: 1

 Example 2:
 Input:
 11000
 11000
 00100
 00011

 Output: 3
 */

public class Solution {
    private int m;
    private int n;

    public int numIslands(char[][] grid) {
        int result = 0;

        n = grid.length;

        if (n == 0) return result;

        m = grid[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    checkIsland(grid, i, j);

                    result++;
                }
            }
        }

        return result;
    }

    private void checkIsland(char[][] grid, int i, int j)
    {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') return;

        grid[i][j] = '0';

        checkIsland(grid, i - 1, j);
        checkIsland(grid, i + 1, j);
        checkIsland(grid, i, j - 1);
        checkIsland(grid, i, j + 1);
    }
}
