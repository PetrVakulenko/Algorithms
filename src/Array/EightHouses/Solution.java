package Array.EightHouses;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 Eight houses, represented as cells, are arranged in a straight line.
 Each day every cell competes with its adjacent cells (neighbors).
 An integer value of 1 represents an active cell and a value of 0 represents an inactive cell.
 If the neighbors on both the sides of a cell are either active or inactive,
    the cell becomes inactive on the next day; otherwise the cell becomes active.
 The two cells on each end have a single adjacent cell,
    so assume that the unoccupied space on the opposite side is an inactive cell.
 Even after updating the cell state, consider its previous state when updating the state of other cells.
 The state information of all cells should be updated simultaneously.

 Example 1:
 Input: states = [1,1,1,0,1,1,1,1], days = 2
 Output: [0,0,0,0,0,1,1,0]

 */

public class Solution {
    public List cellCompete(int[] states, int days)
    {
        int i = 0, j = 0, arrLength = states.length;

        List<Integer> result = new ArrayList<>();

        int[] tmp = Arrays.copyOf(states, arrLength);

        for(i = 0; i < days; i++) {
            for (j = 0; j < arrLength; j++) {
                if (j == 0) {
                    tmp[j] = states[1] == 0 ? 0 : 1;
                    continue;
                }

                if (j == arrLength - 1) {
                    tmp[j] = states[j-1] == 0 ? 0 : 1;
                    continue;
                }

                tmp[j] = states[j-1] == states[j+1] ? 0 : 1;

            }

            states = Arrays.copyOf(tmp, arrLength);
        }

        for (i = 0; i < arrLength; i++){
            result.add(tmp[i]);
        }

        return result;
    }
}
