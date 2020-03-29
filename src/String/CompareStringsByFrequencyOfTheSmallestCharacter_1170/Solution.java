package String.CompareStringsByFrequencyOfTheSmallestCharacter_1170;

import java.util.Arrays;
import java.util.HashMap;

/**
 1170. Compare Strings by Frequency of the Smallest Character

 Let's define a function f(s) over a non-empty string s, which calculates the frequency of the smallest character in s.
 For example, if s = "dcce" then f(s) = 2 because the smallest character is "c" and its frequency is 2.
 Now, given string arrays queries and words, return an integer array answer,
   where each answer[i] is the number of words such that f(queries[i]) < f(W), where W is a word in words.

 Example 1:
 Input: queries = ["cbd"], words = ["zaaaz"]
 Output: [1]
 Explanation: On the first query we have f("cbd") = 1, f("zaaaz") = 3 so f("cbd") < f("zaaaz").

 Example 2:
 Input: queries = ["bbb","cc"], words = ["a","aa","aaa","aaaa"]
 Output: [1,2]
 Explanation: On the first query only f("bbb") < f("aaaa"). On the second query both f("aaa") and f("aaaa") are both > f("cc").

 Constraints:
 1 <= queries.length <= 2000
 1 <= words.length <= 2000
 1 <= queries[i].length, words[i].length <= 10
 queries[i][j], words[i][j] are English lowercase letters.
 */

public class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int m = queries.length, n = words.length, j, currentQuery;
        int[] queries1 = new int[m];
        int[] words1 = new int[n];

        for (int i = 0; i < n; i++) {
            words1[i] = this.checkString(words[i]);
        }
        Arrays.sort(words1);

        HashMap<Integer, Integer> cache = new HashMap();

        for (int i = 0; i < m; i++) {
            currentQuery = this.checkString(queries[i]);

            if (cache.containsKey(currentQuery)) {
                queries1[i] = cache.get(currentQuery);
                continue;
            }

            j = n - 1;
            while (j >= 0) {
                if (currentQuery - words1[j] >= 0) {
                    break;
                }
                j--;
            }

            cache.put(currentQuery, n - j - 1);

            queries1[i] = cache.get(currentQuery);
        }

        return queries1;
    }

    private int checkString(String str)
    {
        int[] arr = new int[26];
        char min = 'z';

        for (char c: str.toCharArray()) {
            if (c <= min) {
                min = c;
                arr[c - 'a']++;
            }
        }

        return arr[min - 'a'];
    }
}
