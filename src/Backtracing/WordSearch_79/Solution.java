package Backtracing.WordSearch_79;

import java.util.*;

/**
 79. Word Search

 Given a 2D board and a word, find if the word exists in the grid.
 The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

 Example:
 board =
 [
     ['A','B','C','E'],
     ['S','F','C','S'],
     ['A','D','E','E']
 ]

 Given word = "ABCCED", return true.
 Given word = "SEE", return true.
 Given word = "ABCB", return false.

 Constraints:
 board and word consists only of lowercase and uppercase English letters.
 1 <= board.length <= 200
 1 <= board[i].length <= 200
 1 <= word.length <= 10^3
 */

public class Solution {
    boolean visited[][];

    public boolean exist(char[][] board, String word) {
        visited= new boolean[board.length][board[0].length];

        for(int i=0; i<board.length; i++)
            for(int j=0; j<board[0].length; j++)
                if(board[i][j]==word.charAt(0) && search(i,j,0,board,word))
                    return true;

        return false;
    }
    private boolean search(int i, int j, int index, char[][] board, String word) {
        if(index==word.length())
            return true;
        if(i>=board.length|| i<0 || j<0 || j>= board[0].length
                || visited[i][j] || word.charAt(index)!=board[i][j])
            return false;

        visited[i][j]=true;
        if(search(i+1, j, index+1, board, word)||
                search(i-1, j, index+1, board, word)||
                search(i, j+1, index+1, board, word)||
                search(i, j-1, index+1, board, word))
            return true;

        visited[i][j]=false;
        return false;
    }
}