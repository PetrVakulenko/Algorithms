package Math.NextGreaterElementI_496;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] arr1 = {4,1,2};
//        int[] arr2 = {1,3,4,2};
        int[] arr1 = {2,4};
        int[] arr2 = {1,2,3,4};
        Utils.PrintResult.printArray(s.nextGreaterElement(arr1, arr2));
    }
}
