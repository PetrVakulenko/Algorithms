package Depth_first_Search.PossibleBipartition_886;

import java.util.*;

/**
 886. Possible Bipartition

 Given a set of N people (numbered 1, 2, ..., N), we would like to split everyone into two groups of any size.
 Each person may dislike some other people, and they should not go into the same group.
 Formally, if dislikes[i] = [a, b], it means it is not allowed to put the people numbered a and b into the same group.
 Return true if and only if it is possible to split everyone into two groups in this way.

 Example 1:
 Input: N = 4, dislikes = [[1,2],[1,3],[2,4]]
 Output: true
 Explanation: group1 [1,4], group2 [2,3]

 Example 2:
 Input: N = 3, dislikes = [[1,2],[1,3],[2,3]]
 Output: false

 Example 3:
 Input: N = 5, dislikes = [[1,2],[2,3],[3,4],[4,5],[1,5]]
 Output: false

 Constraints:
 1 <= N <= 2000
 0 <= dislikes.length <= 10000
 dislikes[i].length == 2
 1 <= dislikes[i][j] <= N
 dislikes[i][0] < dislikes[i][1]
 There does not exist i != j for which dislikes[i] == dislikes[j].
 */

public class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        if(dislikes.length == 0) return true;
        Map<Integer, Set<Integer>> g = new HashMap<>();

        for(int[] e : dislikes) {
            g.putIfAbsent(e[0], new HashSet<>());
            g.putIfAbsent(e[1], new HashSet<>());
            g.get(e[0]).add(e[1]);
            g.get(e[1]).add(e[0]);
        }

        int[] map = new int[N+1];

        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= N; i++) {
            if(map[i] != 0) continue;

            map[i] = -1;
            q.offer(i);

            while(!q.isEmpty()) {
                int cur = q.poll();
                if(!g.containsKey(cur)) continue;

                for(int nxt : g.get(cur)) {
                    if(map[nxt] == map[cur]) return false;
                    if(map[nxt] != 0) continue;

                    map[nxt] = -map[cur];
                    q.offer(nxt);
                }
            }
        }
        return true;
    }
}
