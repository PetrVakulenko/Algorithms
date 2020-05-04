package Array.XofaKindinaDeckofCards_914;

import java.util.HashMap;

/**
 914. X of a Kind in a Deck of Cards

 In a deck of cards, each card has an integer written on it.
 Return true if and only if you can choose X >= 2 such that it is possible to split the entire deck into 1 or more groups of cards, where:
 Each group has exactly X cards.
 All the cards in each group have the same integer.

 Example 1:
 Input: deck = [1,2,3,4,4,3,2,1]
 Output: true
 Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].

 Example 2:
 Input: deck = [1,1,1,2,2,2,3,3]
 Output: false´
 Explanation: No possible partition.

 Example 3:
 Input: deck = [1]
 Output: false
 Explanation: No possible partition.

 Example 4:
 Input: deck = [1,1]
 Output: true
 Explanation: Possible partition [1,1].

 Example 5:
 Input: deck = [1,1,2,2,2,2]
 Output: true
 Explanation: Possible partition [1,1],[2,2],[2,2].

 Constraints:
 1 <= deck.length <= 10^4
 0 <= deck[i] < 10^4
 */

public class Solution {
    static int gcd(int a, int b) {
        if (b == 0) return a;

        return gcd(b, a % b);
    }

    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : deck) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        int gcd = map.get(deck[0]);
        for (int i : map.keySet()) {
            gcd = gcd(map.get(i), gcd);
        }

        if (gcd < 2) return false;

        return true;
    }
}
