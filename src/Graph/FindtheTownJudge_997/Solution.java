package Graph.FindtheTownJudge_997;

import java.util.ArrayList;

/**
 997. Find the Town Judge

 In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.
 If the town judge exists, then:
 The town judge trusts nobody.
 Everybody (except for the town judge) trusts the town judge.
 There is exactly one person that satisfies properties 1 and 2.
 You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.
 If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.

 Example 1:
 Input: N = 2, trust = [[1,2]]
 Output: 2

 Example 2:
 Input: N = 3, trust = [[1,3],[2,3]]
 Output: 3

 Example 3:
 Input: N = 3, trust = [[1,3],[2,3],[3,1]]
 Output: -1

 Example 4:
 Input: N = 3, trust = [[1,2],[2,3]]
 Output: -1

 Example 5:
 Input: N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
 Output: 3

 Note:
 1 <= N <= 1000
 trust.length <= 10000
 trust[i] are all different
 trust[i][0] != trust[i][1]
 1 <= trust[i][0], trust[i][1] <= N
 */

public class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] trust1 = new int[N + 1];
        int[] trustment = new int[N + 1];

        for (int i = 0; i < trust.length; i++) {
            trust1[trust[i][0]]++;
            trustment[trust[i][1]]++;
        }

        for (int i = 1; i < trust1.length; i++) {
            if (trust1[i] == 0 && trustment[i] == trust1.length - 2) return i;
        }

        return -1;
    }
}
