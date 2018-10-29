package Utils;

public class PrintResult {
    public static void showResult(int[][] result)
    {
        System.out.println();
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
