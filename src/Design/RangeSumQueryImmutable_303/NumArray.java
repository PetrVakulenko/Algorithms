package Design.RangeSumQueryImmutable_303;

class NumArray {
    int prefix[] = new int[1];

    public NumArray(int[] nums) {
        prefix = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return prefix[j + 1] - prefix[i];
    }
}
