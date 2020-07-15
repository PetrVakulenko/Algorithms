package HashTable.PrisonCellsAfterNDays_957;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {0,1,0,1,1,0,0,1};

        System.out.println(Arrays.toString(s.prisonAfterNDays(nums, 7)));
    }
}
