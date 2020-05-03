package String.BuddyStrings_859;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 859. Buddy Strings

 Given two strings A and B of lowercase letters, return true if and only if we can swap two letters in A so that the result equals B.

 Example 1:
 Input: A = "ab", B = "ba"
 Output: true

 Example 2:
 Input: A = "ab", B = "ab"
 Output: false

 Example 3:
 Input: A = "aa", B = "aa"
 Output: true

 Example 4:
 Input: A = "aaaaaaabc", B = "aaaaaaacb"
 Output: true

 Example 5:
 Input: A = "", B = "aa"
 Output: false

 Note:
 0 <= A.length <= 20000
 0 <= B.length <= 20000
 A and B consist only of lowercase letters.
 */

public class Solution {
    public boolean buddyStrings(String A, String B) {
        int[] chars = new int[128];

        List<Integer> wrongIndexes = new ArrayList();

        boolean hasAtLeastTwoCharacters = false;

        int size = 0;

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                wrongIndexes.add(i);

                size++;
            } else if (!hasAtLeastTwoCharacters) {
                chars[A.charAt(i)]++;

                if (chars[A.charAt(i)] > 1) hasAtLeastTwoCharacters = true;
            }

            if (size > 2) return false;
        }

        if (size == 0 && hasAtLeastTwoCharacters) return true;
        if (size != 2) return false;

        return A.charAt(wrongIndexes.get(0)) == B.charAt(wrongIndexes.get(1)) &&
                B.charAt(wrongIndexes.get(0)) == A.charAt(wrongIndexes.get(1));
    }
}
