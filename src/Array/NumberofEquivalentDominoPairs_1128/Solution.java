package Array.NumberofEquivalentDominoPairs_1128;

/**
 1128. Number of Equivalent Domino Pairs

 Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] = [c, d] if and only if either
   (a==c and b==d), or (a==d and b==c) - that is, one domino can be rotated to be equal to another domino.
 Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and dominoes[i] is equivalent to dominoes[j].

 Example 1:
 Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
 Output: 1

 Constraints:
 1 <= dominoes.length <= 40000
 1 <= dominoes[i][j] <= 9
 */

public class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[100];
        int ans = 0, index = 0;
        for (int[] dom : dominoes) {
            index = dom[0] < dom[1] ? dom[0] * 10 + dom[1] : dom[1] * 10 + dom[0];
            ans += count[index]++;
        }
        return ans;
    }
}
