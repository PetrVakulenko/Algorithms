package String.StringMatchingInAnArray_1408;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 1408. String Matching in an Array

 Given an array of string words. Return all strings in words which is substring of another word in any order.
 String words[i] is substring of words[j], if can be obtained removing some characters to left and/or right side of words[j].

 Example 1:
 Input: words = ["mass","as","hero","superhero"]
 Output: ["as","hero"]
 Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
 ["hero","as"] is also a valid answer.

 Example 2:
 Input: words = ["leetcode","et","code"]
 Output: ["et","code"]
 Explanation: "et", "code" are substring of "leetcode".

 Example 3:
 Input: words = ["blue","green","bu"]
 Output: []

 Constraints:
 1 <= words.length <= 100
 1 <= words[i].length <= 30
 words[i] contains only lowercase English letters.
 It's guaranteed that words[i] will be unique.
 */

public class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList();

        int[] addedWord = new int[words.length];

        for (int i = 0; i < words.length - 1; i++) {
            if (addedWord[i] > 0) continue;

            for (int j = i+1; j < words.length; j++) {
                if (addedWord[j] > 0) continue;

                if (words[j].indexOf(words[i]) !=-1) {
                    addedWord[i]++;
                    result.add(words[i]);
                    break;
                }

                if (words[i].indexOf(words[j]) !=-1) {
                    addedWord[j]++;
                    result.add(words[j]);
                }
            }
        }

        return result;
    }
}
