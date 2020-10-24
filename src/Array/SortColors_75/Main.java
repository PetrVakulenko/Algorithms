package Array.SortColors_75;

public class Main {
    public static void main(String[] argv){
        Solution s = new Solution();
        int[] array = {0,2,1,2,1,0,0,2,1,2};
        s.sortColors(array);

        Utils.PrintResult.printArray(array);
    }
}
