package Greedy.WalkingRobotSimulation_874;

import java.util.HashMap;
import java.util.TreeSet;

/**
 874. Walking Robot Simulation

 A robot on an infinite grid starts at point (0, 0) and faces north.  The robot can receive one of three possible types of commands:
 -2: turn left 90 degrees
 -1: turn right 90 degrees
 1 <= x <= 9: move forward x units
 Some of the grid squares are obstacles.
 The i-th obstacle is at grid point (obstacles[i][0], obstacles[i][1])
 If the robot would try to move onto them, the robot stays on the previous grid square instead (but still continues following the rest of the route.)
 Return the square of the maximum Euclidean distance that the robot will be from the origin.

 Example 1:
 Input: commands = [4,-1,3], obstacles = []
 Output: 25
 Explanation: robot will go to (3, 4)

 Example 2:
 Input: commands = [4,-1,4,-2,4], obstacles = [[2,4]]
 Output: 65
 Explanation: robot will be stuck at (1, 4) before turning left and going to (1, 8)

 Note:
 0 <= commands.length <= 10000
 0 <= obstacles.length <= 10000
 -30000 <= obstacle[i][0] <= 30000
 -30000 <= obstacle[i][1] <= 30000
 The answer is guaranteed to be less than 2 ^ 31.
 */
public class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        HashMap<Integer, TreeSet<Integer>> horizontalMap = new HashMap();
        HashMap<Integer, TreeSet<Integer>> verticalMap = new HashMap();

        for(int i = 0; i < obstacles.length; i++) {
            verticalMap.putIfAbsent(obstacles[i][0], new TreeSet());
            verticalMap.get(obstacles[i][0]).add(obstacles[i][1]);

            horizontalMap.putIfAbsent(obstacles[i][1], new TreeSet());
            horizontalMap.get(obstacles[i][1]).add(obstacles[i][0]);
        }

        int maxDist = 0;
        int x = 0;
        int y = 0;
        int currentDir = 1; // 1 represents North, 2 represents east, 3-S, 4-W
        for(int i = 0; i < commands.length; i++) {
            int command = commands[i];
            switch (command) {
                case -2 :
                    currentDir = (currentDir-1 == 0 ? 4 : currentDir-1);
                    break;
                case -1:
                    currentDir = (currentDir+1 == 5 ? 1 : currentDir+1);
                    break;
                default:
                    if (currentDir == 1) {
                        y = findDestinationAsc(verticalMap, x, y, command);
                    } else if (currentDir == 2) {
                        x = findDestinationAsc(horizontalMap, y, x, command);
                    } else if (currentDir == 3) {
                        y = findDestinationDesc(verticalMap, x, y, command);
                    } else {
                        x = findDestinationDesc(horizontalMap, y, x, command);
                    }
                    maxDist = Math.max(maxDist, x*x + y*y);
                    break;
            }
        }

        return maxDist;
    }

    private int findDestinationAsc(HashMap<Integer, TreeSet<Integer>> map, int fixPosition, int movePosition, int desiredDist) {
        TreeSet<Integer> obstacles = map.getOrDefault(fixPosition, new TreeSet());
        Integer closetObstacle = obstacles.ceiling(movePosition+1);
        if (closetObstacle != null) {
            return Math.min(closetObstacle-1, movePosition+desiredDist);
        } else {
            return movePosition+desiredDist;
        }
    }

    private int findDestinationDesc(HashMap<Integer, TreeSet<Integer>> map, int fixPosition, int movePosition, int desiredDist) {
        TreeSet<Integer> obstacles = map.getOrDefault(fixPosition, new TreeSet());
        Integer closetObstacle = obstacles.floor(movePosition-1);

        if (closetObstacle != null) {
            return Math.max(closetObstacle+1, movePosition-desiredDist);
        } else {
            return movePosition-desiredDist;
        }
    }
}
