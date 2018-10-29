package Array.SortArrayByParity_905;

public class Main {
    public static void main(String[] argv){
        Solution s = new Solution();
        int[] array = {4, 2, 3, 7, 6, 1, 5, 8};
        int[] result = s.SortArrayByParity(array);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
