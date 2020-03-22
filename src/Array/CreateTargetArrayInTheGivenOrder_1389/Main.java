package Array.CreateTargetArrayInTheGivenOrder_1389;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int nums[] = {0,1,2,3,4}, index[] = {0,1,2,2,1};

        System.out.println(Arrays.toString(s.createTargetArray(nums, index)));
    }
}