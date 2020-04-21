package Graph.FlowerPlantingWithNoAdjacent;

import java.util.ArrayList;

/**
 1042. Flower Planting With No Adjacent

 You have N gardens, labelled 1 to N.  In each garden, you want to plant one of 4 types of flowers.
 paths[i] = [x, y] describes the existence of a bidirectional path from garden x to garden y.
 Also, there is no garden that has more than 3 paths coming into or leaving it.
 Your task is to choose a flower type for each garden such that, for any two gardens connected by a path,
   they have different types of flowers.
 Return any such a choice as an array answer, where answer[i] is the type of flower planted in the (i+1)-th garden.
 The flower types are denoted 1, 2, 3, or 4.  It is guaranteed an answer exists.

 Example 1:
 Input: N = 3, paths = [[1,2],[2,3],[3,1]]
 Output: [1,2,3]

 Example 2:
 Input: N = 4, paths = [[1,2],[3,4]]
 Output: [1,2,1,2]

 Example 3:
 Input: N = 4, paths = [[1,2],[2,3],[3,4],[4,1],[1,3],[2,4]]
 Output: [1,2,3,4]

 Note:
 1 <= N <= 10000
 0 <= paths.size <= 20000
 No garden has 4 or more paths coming into or leaving it.
 It is guaranteed an answer exists.
 */

public class Solution {

    public int[] gardenNoAdj(int N, int[][] paths) {
        int[] vals = new int[N];
        ArrayList<ArrayList<Integer>> listGarden = new ArrayList();

        for(int i=0; i <= N; i++)
            listGarden.add(new ArrayList<Integer>());

        for(int i=0; i < paths.length; i++){
            int firstNode = paths[i][0];
            int secondNode = paths[i][1];

            listGarden.get(firstNode).add(secondNode);
            listGarden.get(secondNode).add(firstNode);
        }

        for(int i=0; i<N; i++){
            int curNode = i+1;

            boolean one = true;
            boolean two = true;
            boolean three = true;
            boolean four = true;

            for(int adj : listGarden.get(curNode)){
                if(vals[adj-1] == 1) one = false;
                else if(vals[adj-1] == 2) two = false;
                else if(vals[adj-1] == 3) three = false;
                else four = false;
            }

            if(one) vals[i] = 1;
            else if(two) vals[i] = 2;
            else if(three) vals[i] = 3;
            else vals[i] = 4;
        }

        return vals;
    }

    public int[] gardenNoAdj1(int N, int[][] paths) {
        int[] result = new int[N], visited = new int[N];

        int i = 0, index = 0, next = paths[i][1];

        visited[i] = 1;
        result[index++] = 1;

        while (index < N) {
            if (i >= paths.length) i = 0;

            if (visited[i] == 1) {
                i++;
                continue;
            }

            if (paths[i][0] == next) {
                visited[i] = 1;
                result[index++] = i+1;
                next = paths[i][1];
            }

            i++;
        }

        return result;
    }
}
