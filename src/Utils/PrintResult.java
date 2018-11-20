package Utils;

public class PrintResult {
    public static void printMatrix(int[][] result)
    {
        System.out.println();
        for (int i = 0; i < result.length; i++) {
            printArray(result[i]);
        }
    }

    public static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
