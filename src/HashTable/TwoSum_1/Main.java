package HashTable.TwoSum_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(s.twoSum(nums, target)));
    }
}
