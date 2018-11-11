package String.ShortestDistanceToACharacter_821;

/**
 Given a string S and a character C,
 return an array of integers representing the shortest distance from the character C in the string.

 Example 1:
 Input: S = "loveleetcode", C = 'e'
 Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]

 Note:
 S string length is in [1, 10000].
 C is a single character, and guaranteed to be in string S.
 All letters in S and C are lowercase.
 */

public class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] result = new int[S.length()];

        char[] characters = S.toCharArray();

        int lastValidCharacter = -1, prevValidCharacter;

        for(int i = 0; i < characters.length; i++) {
            if (characters[i] == C) {
                prevValidCharacter = lastValidCharacter;
                lastValidCharacter = i;

                for (int j = prevValidCharacter > 0 ? prevValidCharacter + 1 : 0; j < lastValidCharacter; j++) {
                    if (prevValidCharacter == -1) {
                        result[j] = lastValidCharacter - j;
                    } else {
                        result[j] = Math.min(lastValidCharacter - j, j - prevValidCharacter);
                    }
                }
                result[lastValidCharacter] = 0;
            }

            if (i == characters.length - 1) {
                for (int j = lastValidCharacter + 1; j <= i; j++) {
                    result[j] = j - lastValidCharacter;
                }
            }
        }

        return result;
    }
}
