package Array.IntersectionofTwoArraysII_350;

public class Main {
    public static void main(String[] argv){
        Solution s = new Solution();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        Utils.PrintResult.printArray(s.intersect(nums1, nums2));
    }
}
