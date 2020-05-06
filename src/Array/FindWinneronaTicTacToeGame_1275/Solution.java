package Array.FindWinneronaTicTacToeGame_1275;

import java.util.HashSet;
import java.util.Set;

/**
 1275. Find Winner on a Tic Tac Toe Game

 Tic-tac-toe is played by two players A and B on a 3 x 3 grid.
 Here are the rules of Tic-Tac-Toe:
 Players take turns placing characters into empty squares (" ").
 The first player A always places "X" characters, while the second player B always places "O" characters.
 "X" and "O" characters are always placed into empty squares, never on filled ones.
 The game ends when there are 3 of the same (non-empty) character filling any row, column, or diagonal.
 The game also ends if all squares are non-empty.
 No more moves can be played if the game is over.
 Given an array moves where each element is another array of size 2 corresponding to the row and column of
   the grid where they mark their respective character in the order in which A and B play.
 Return the winner of the game if it exists (A or B), in case the game ends in a draw return "Draw",
   if there are still movements to play return "Pending".
 You can assume that moves is valid (It follows the rules of Tic-Tac-Toe),
   the grid is initially empty and A will play first.

 Example 1:
 Input: moves = [[0,0],[2,0],[1,1],[2,1],[2,2]]
 Output: "A"
 Explanation: "A" wins, he always plays first.
 "X  "    "X  "    "X  "    "X  "    "X  "
 "   " -> "   " -> " X " -> " X " -> " X "
 "   "    "O  "    "O  "    "OO "    "OOX"

 Example 2:
 Input: moves = [[0,0],[1,1],[0,1],[0,2],[1,0],[2,0]]
 Output: "B"
 Explanation: "B" wins.
 "X  "    "X  "    "XX "    "XXO"    "XXO"    "XXO"
 "   " -> " O " -> " O " -> " O " -> "XO " -> "XO "
 "   "    "   "    "   "    "   "    "   "    "O  "

 Example 3:
 Input: moves = [[0,0],[1,1],[2,0],[1,0],[1,2],[2,1],[0,1],[0,2],[2,2]]
 Output: "Draw"
 Explanation: The game ends in a draw since there are no moves to make.
 "XXO"
 "OOX"
 "XOX"

 Example 4:
 Input: moves = [[0,0],[1,1]]
 Output: "Pending"
 Explanation: The game has not finished yet.
 "X  "
 " O "
 "   "

 Constraints:
 1 <= moves.length <= 9
 moves[i].length == 2
 0 <= moves[i][j] <= 2
 There are no repeated elements on moves.
 moves follow the rules of tic tac toe.
 */
public class Solution {
    public String tictactoe(int[][] moves) {
        char[][] field = new char[3][3];

        char player;
        for (int j = 0; j < moves.length; j++) {
            player = j % 2 == 0 ? 'A' : 'B';

            int[] move = moves[j];

            field[move[0]][move[1]] = player;

            int count1 = 0;
            int count2 = 0;

            if (move[0] == field.length - move[1] - 1) {
                for (int i = 0; i < field.length; i++) {
                    if (field[i][field.length - i - 1] == player) count2++;
                    else break;
                }
            }

            if (move[0] == move[1]) {
                for (int i = 0; i < field.length; i++) {
                    if (field[i][i] == player) count1++;
                    else break;
                }
            }

            if (count1 == 3 || count2 == 3) {
                return String.valueOf(player);
            } else {
                count1 = 0;
                count2 = 0;
            }

            for (int i = 0; i < field.length; i++) {
                if (field[i][move[1]] == player) count1++;
                else break;
            }

            for (int i = 0; i < field.length; i++) {
                if (field[move[0]][i] == player) count2++;
                else break;
            }


            if (count1 == 3 || count2 == 3) return String.valueOf(player);
        }

        return moves.length < 9 ? "Pending" : "Draw";
    }
}
