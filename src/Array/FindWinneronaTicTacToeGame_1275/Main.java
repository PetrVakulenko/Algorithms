package Array.FindWinneronaTicTacToeGame_1275;

public class Main {
    public static void main(String[] argv){
        Solution s = new Solution();

        int[][] moves = {{0,0},{2,0},{1,1},{2,1},{2,2}};

        System.out.println(s.tictactoe(moves));
    }
}
