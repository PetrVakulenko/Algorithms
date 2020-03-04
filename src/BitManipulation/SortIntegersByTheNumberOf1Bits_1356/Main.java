package BitManipulation.SortIntegersByTheNumberOf1Bits_1356;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] input = {0,1,2,3,4,5,6,7,8};

        System.out.println(Arrays.toString(s.sortByBits(input)));
    }
}
