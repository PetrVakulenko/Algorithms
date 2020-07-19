package String.PathCrossing_1496;

import java.util.*;

/**
 1496. Path Crossing

 Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east, or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.
 Return True if the path crosses itself at any point, that is, if at any time you are on a location you've previously visited. Return False otherwise.

 Example 1:
 Input: path = "NES"
 Output: false
 Explanation: Notice that the path doesn't cross any point more than once.

 Example 2:
 Input: path = "NESWW"
 Output: true
 Explanation: Notice that the path visits the origin twice.

 Constraints:
 1 <= path.length <= 10^4
 path will only consist of characters in {'N', 'S', 'E', 'W}
 */

public class Solution {
    class Pair {
        public int hashCode() {
            int hash = 7;
            hash = 89 * hash + this.x;
            hash = 89 * hash + this.y;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Pair other = (Pair) obj;
            if (this.x != other.x) {
                return false;
            }
            if (this.y != other.y) {
                return false;
            }
            return true;
        }
        int x;
        int y;

        public Pair(int x1, int y1) {
            x = x1;
            y = y1;
        }
    }

    public boolean isPathCrossing(String path) {
        int currX = 0;
        int currY = 0;

        HashSet<Pair> hs = new HashSet();
        hs.add(new Pair(0,0));
        for(int i=0; i<path.length();i++){
            char ch = path.charAt(i);
            if(ch == 'N'){
                currY += 1;
            }else if(ch == 'S'){
                currY -= 1;
            }else if(ch == 'E'){
                currX += 1;
            }else if(ch == 'W'){
                currX -= 1;
            }
            Pair t = new Pair(currX,currY);
            if(hs.contains(t))
                return true;
            hs.add(t);

        }

        return false;
    }
}