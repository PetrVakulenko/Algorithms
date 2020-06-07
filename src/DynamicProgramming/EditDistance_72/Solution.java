package DynamicProgramming.EditDistance_72;

/**
 72. Edit Distance

 Given two words word1 and word2, find the minimum number of operations required to convert word1 to word2.
 You have the following 3 operations permitted on a word:
 Insert a character
 Delete a character
 Replace a character

 Example 1:
 Input: word1 = "horse", word2 = "ros"
 Output: 3
 Explanation:
 horse -> rorse (replace 'h' with 'r')
 rorse -> rose (remove 'r')
 rose -> ros (remove 'e')

 Example 2:
 Input: word1 = "intention", word2 = "execution"
 Output: 5
 Explanation:
 intention -> inention (remove 't')
 inention -> enention (replace 'i' with 'e')
 enention -> exention (replace 'n' with 'x')
 exention -> exection (replace 'n' with 'c')
 exection -> execution (insert 'u')
 */

public class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i = 0; i < m + 1; i++){
            for(int j = 0; j < n + 1; j++){
                dp[i][j]=-1;
            }
        }
        return ed(word1, word2, 0, 0, dp);
    }

    static int ed(String word1, String word2, int i, int j, int[][] dp){
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(i == word1.length()){
            return dp[i][j] = word2.length() - j;
        }
        if(j == word2.length()){
            return dp[i][j] = word1.length() - i;
        }

        if(word1.charAt(i) == word2.charAt(j)){
            return dp[i][j] = ed(word1, word2, i+1, j+1, dp);
        }
        return dp[i][j] = 1 + Math.min(ed(word1, word2, i+1, j+1, dp),
                Math.min(ed(word1, word2, i+1, j, dp), ed(word1, word2, i, j+1, dp)));
    }
}
