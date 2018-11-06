package Array.SortArrayByParityII_922;

public class Main {
    public static void main(String[] argv){
        Solution s = new Solution();
        int[] array = {4, 2, 3, 7, 6, 1, 5, 8};
        int[] result = s.SortArrayByParityII(array);

        Utils.PrintResult.printArray(result);
    }
}
