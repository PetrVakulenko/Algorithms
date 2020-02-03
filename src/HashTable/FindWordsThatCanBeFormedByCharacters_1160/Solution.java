package HashTable.FindWordsThatCanBeFormedByCharacters_1160;

import java.util.HashSet;
import java.util.Set;

/**
 1160. Find Words That Can Be Formed by Characters

 You are given an array of strings words and a string chars.
 A string is good if it can be formed by characters from chars (each character can only be used once).
 Return the sum of lengths of all good strings in words.

 Example 1:
 Input: words = ["cat","bt","hat","tree"], chars = "atach"
 Output: 6
 Explanation:
 The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.

 Example 2:
 Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 Output: 10
 Explanation:
 The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.


 Note:
 1 <= words.length <= 1000
 1 <= words[i].length, chars.length <= 100
 All strings contain lowercase English letters only.
 */

class Solution {
    public int countCharacters(String[] words, String chars) {
        int result = 0, i, j, k, tempWordLength;

        Set<Integer> tempSet;

        char[] charsArray = chars.toCharArray();

        for (i = 0; i < words.length; i++) {
            char[] tempWordArray = words[i].toCharArray();

            tempSet = new HashSet();

            tempWordLength = tempWordArray.length;

            for (k = 0; k < charsArray.length; k++) {
                for (j = 0; j < tempWordLength; j ++) {
                    if (charsArray[k] == tempWordArray[j] && !tempSet.contains(j)) {
                        tempSet.add(j);
                        break;
                    }
                }
            }

            if (tempWordLength == tempSet.size()) {
                result += tempWordLength;
            }
        }

        return result;
    }
}