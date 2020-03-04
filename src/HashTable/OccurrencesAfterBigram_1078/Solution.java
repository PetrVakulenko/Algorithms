package HashTable.OccurrencesAfterBigram_1078;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 1078. Occurrences After Bigram

 Given words first and second, consider occurrences in some text of the form "first second third",
   where second comes immediately after first, and third comes immediately after second.
 For each such occurrence, add "third" to the answer, and return the answer.

 Example 1:
 Input: text = "alice is a good girl she is a good student", first = "a", second = "good"
 Output: ["girl","student"]

 Example 2:
 Input: text = "we will we will rock you", first = "we", second = "will"
 Output: ["we","rock"]

 Note:
 1 <= text.length <= 1000
 text consists of space separated words, where each word consists of lowercase English letters.
 1 <= first.length, second.length <= 10
 first and second consist of lowercase English letters.
 */

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");

        List<String> tmp = new ArrayList();

        for(int i = 0; i < words.length - 2; i++) {
            if (words[i].equals(first) && words[i+1].equals(second)) {
                tmp.add(words[i+2]);
            }
        }

        return tmp.toArray(new String[tmp.size()]);
    }
}