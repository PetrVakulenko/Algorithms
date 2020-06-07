package Greedy.QueueReconstructionbyHeight_406;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] input = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        System.out.println(Arrays.toString(s.reconstructQueue(input)));
    }
}
