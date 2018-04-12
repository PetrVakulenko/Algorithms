package String.JudgeRouteCircle_657;

/**
 657. Judge Route Circle
 https://leetcode.com/articles/judge-route-circle/

 Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

 The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

 Example 1:
 Input: "UD"
 Output: true

 Example 2:
 Input: "LL"
 Output: false
 */

public class Solution {
    public boolean judgeCircle(String moves) {
        moves = moves.toLowerCase();
        return getSteps(moves,"u") - getSteps(moves,"d") == 0 &&
               getSteps(moves,"r") - getSteps(moves,"l") == 0;
    }

    private int getSteps(String moves,String step){
        return moves.replaceAll("[^"+step+"]","").length();
    }

    public boolean judgeCircle1(String moves) {
        moves = moves.toLowerCase();

        int x = 0, y = 0;
        for(int i = 0; i< moves.length(); i++){
            switch(moves.charAt(i)){
                case 'l':
                    x--;
                    break;
                case 'r':
                    x++;
                    break;
                case 'u':
                    y++;
                    break;
                case 'd':
                    y--;
                    break;
            }
        }

        return x == 0 && y == 0;
    }
}
