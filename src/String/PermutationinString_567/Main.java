package String.PermutationinString_567;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abc";
        int[][] shift = {{0,1},{1,2}};
        System.out.println(solution.stringShift(s, shift));
    }
}
