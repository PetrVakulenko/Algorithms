package HashTable.UncommonWordsFromTwoSentences_884;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 884. Uncommon Words from Two Sentences
 https://leetcode.com/problems/uncommon-words-from-two-sentences/

 We are given two sentences A and B.  (A sentence is a string of space separated words.
    Each word consists only of lowercase letters.)

 A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
 Return a list of all uncommon words.
 You may return the list in any order.

 Example 1:
 Input: A = "this apple is sweet", B = "this apple is sour"
 Output: ["sweet","sour"]

 Example 2:
 Input: A = "apple apple", B = "banana"
 Output: ["banana"]

 Note:
 0 <= A.length <= 200
 0 <= B.length <= 200
 A and B both contain only spaces and lowercase letters.
 */

public class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> h = new HashMap<>();

        String[] tmpArr = (A + " " + B).split(" ");
        int i, tmp;

        for (i = 0; i < tmpArr.length; i++) {
            tmp = h.get(tmpArr[i]) != null ? h.get(tmpArr[i]) : 0;

            h.put(tmpArr[i], tmp+1);
        }

        List<String> res = new ArrayList<>();

        tmpArr = h.keySet().toArray(new String[0]);

        for (i = 0; i < h.size(); i++) {
            if (h.get(tmpArr[i]) == 1) {
                res.add(tmpArr[i]);
            }
        }

        return res.toArray(new String[0]);
    }
}
