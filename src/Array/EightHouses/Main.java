package Array.EightHouses;

import java.util.Arrays;

public class Main {
    public static void main(String[] argv){
        Solution s = new Solution();
        int[] states = {1,1,1,0,1,1,1,1};
        int days = 2;
        Utils.PrintResult.printListInteger(s.cellCompete(states, days));
    }
}
