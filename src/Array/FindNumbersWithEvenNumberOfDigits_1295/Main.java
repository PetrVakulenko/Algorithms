package Array.FindNumbersWithEvenNumberOfDigits_1295;

import Utils.PrintResult;

public class Main {
    public static void main(String[] argv){
        Solution s = new Solution();

        int[] array = {555,901,482,1771};
        PrintResult.printArray(array);

        System.out.println(s.findNumbers(array));
    }
}
