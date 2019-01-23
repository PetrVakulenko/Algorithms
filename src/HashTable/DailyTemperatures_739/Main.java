package HashTable.DailyTemperatures_739;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] input = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] input = {55,38,53,81,61,93,97,32,43,78};
        System.out.println(Arrays.toString(s.dailyTemperatures(input)));
    }
}
