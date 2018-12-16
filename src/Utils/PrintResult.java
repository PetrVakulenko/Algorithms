package Utils;

import java.util.List;
import java.util.Set;

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

    public static void printListInteger(List<Integer> list)
    {
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
    }

    public static void printListDouble(List<Double> list)
    {
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
    }
}
