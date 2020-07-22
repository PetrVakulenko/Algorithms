package Backtracing.WordSearch_79;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        char[][] chars = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        System.out.println(s.exist(chars, "ABFD"));
    }
}