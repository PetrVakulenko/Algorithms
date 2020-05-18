package String.PermutationinString_567;

import java.util.*;

/**
 567. Permutation in String

 Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1.
 In other words, one of the first string's permutations is the substring of the second string.

 Example 1:
 Input: s1 = "ab" s2 = "eidbaooo"
 Output: True
 Explanation: s2 contains one permutation of s1 ("ba").

 Example 2:
 Input:s1= "ab" s2 = "eidboaoo"
 Output: False

 Note:
 The input strings only contain lower case letters.
 The length of both given strings is in range [1, 10,000].
 */

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            s2Count[s2.charAt(i) - 'a']++;
            if (i >= s1.length()) {
                s2Count[s2.charAt(i - s1.length()) - 'a']--;
            }

            if (Arrays.equals(s1Count, s2Count)) {
                return true;
            }
        }

        return false;
    }
}