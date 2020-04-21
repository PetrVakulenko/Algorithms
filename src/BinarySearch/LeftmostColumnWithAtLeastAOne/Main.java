package BinarySearch.LeftmostColumnWithAtLeastAOne;

import Utils.BinaryMatrix;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        BinaryMatrix b = new BinaryMatrix(2, 2);

        try {
            b.setOne(0, 1);
            b.setOne(1, 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(s.leftMostColumnWithOne(b));
    }
}
