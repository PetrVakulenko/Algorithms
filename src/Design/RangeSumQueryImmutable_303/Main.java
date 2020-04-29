package Design.RangeSumQueryImmutable_303;

public class Main {
    public static void main(String[] args) {
        int[] input = {-2, 0, 3, -5, 2, -1};

        NumArray arr = new NumArray(input);

        arr.sumRange(0, 2);
        arr.sumRange(2, 5);
        arr.sumRange(0, 5);
    }
}
