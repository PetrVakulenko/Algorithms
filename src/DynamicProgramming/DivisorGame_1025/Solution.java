package DynamicProgramming.DivisorGame_1025;

/**
 1025. Divisor Game

 Alice and Bob take turns playing a game, with Alice starting first.
 Initially, there is a number N on the chalkboard.  On each player's turn, that player makes a move consisting of:
 Choosing any x with 0 < x < N and N % x == 0.
 Replacing the number N on the chalkboard with N - x.
 Also, if a player cannot make a move, they lose the game.
 Return True if and only if Alice wins the game, assuming both players play optimally.

 Example 1:
 Input: 2
 Output: true
 Explanation: Alice chooses 1, and Bob has no more moves.

 Example 2:
 Input: 3
 Output: false
 Explanation: Alice chooses 1, Bob chooses 1, and Alice has no more moves.
 */

public class Solution {
    public boolean divisorGame(int N) {
        boolean alice = false;

        while (N > 1) {
            if (N % 4 == 0) return !alice;

            for (int i = N/2; i > 0; i--) {
                if (N % i == 0) {
                    N = N - i;

                    alice = !alice;
                    break;
                }
            }
        }

        return alice;
    }
}
