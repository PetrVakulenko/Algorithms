package Graph.FlowerPlantingWithNoAdjacent;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] points = {{1,2},{2,3},{3,4},{4,1},{1,3},{2,4}};
        System.out.println(Arrays.toString(s.gardenNoAdj(4, points)));
    }
}
