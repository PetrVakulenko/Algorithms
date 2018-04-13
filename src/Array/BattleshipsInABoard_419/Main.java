package Array.BattleshipsInABoard_419;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        char[][] board = {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};
        System.out.println(s.countBattleships(board));
    }
}