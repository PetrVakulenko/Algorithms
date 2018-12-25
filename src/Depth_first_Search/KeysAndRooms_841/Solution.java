package Depth_first_Search.KeysAndRooms_841;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

/**
 841. Keys and Rooms
 https://leetcode.com/problems/keys-and-rooms/

 There are N rooms and you start in room 0. Each room has a distinct number in 0, 1, 2, ..., N-1,
    and each room may have some keys to access the next room.

 Formally, each room i has a list of keys rooms[i],
    and each key rooms[i][j] is an integer in [0, 1, ..., N-1] where N = rooms.length.
 A key rooms[i][j] = v opens the room with number v.

 Initially, all the rooms start locked (except for room 0).
 You can walk back and forth between rooms freely.
 Return true if and only if you can enter every room.

 Example 1:
 Input: [[1],[2],[3],[]]
 Output: true
 Explanation:
 We start in room 0, and pick up key 1.
 We then go to room 1, and pick up key 2.
 We then go to room 2, and pick up key 3.
 We then go to room 3.  Since we were able to go to every room, we return true.

 Example 2:
 Input: [[1,3],[3,0,1],[2],[0]]
 Output: false
 Explanation: We can't enter the room with number 2.

 Note:
 1 <= rooms.length <= 1000
 0 <= rooms[i].length <= 1000
 The number of keys in all rooms combined is at most 3000.
 */

public class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> keys = new HashSet<>();
        Set<Integer> visited = new HashSet<>();

        keys.add(0);

        int room = 0;

        while(keys.size() > 0) {
            if (!visited.contains(room)) {
                keys.addAll(rooms.get(room));
                visited.add(room);
            }

            keys.remove(room);

            for(Integer key: keys) {
                room = key;

                break;
            }
        }

        return visited.size() == rooms.size();
    }
}
