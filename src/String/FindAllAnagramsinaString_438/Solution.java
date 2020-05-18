package String.FindAllAnagramsinaString_438;

import java.util.*;

/**
 438. Find All Anagrams in a String

 Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
 The order of output does not matter.

 Example 1:
 Input:
 s: "cbaebabacd" p: "abc"
 Output:
 [0, 6]

 Explanation:
 The substring with start index = 0 is "cba", which is an anagram of "abc".
 The substring with start index = 6 is "bac", which is an anagram of "abc".

 Example 2:
 Input:
 s: "abab" p: "ab"
 Output:
 [0, 1, 2]

 Explanation:
 The substring with start index = 0 is "ab", which is an anagram of "ab".
 The substring with start index = 1 is "ba", which is an anagram of "ab".
 The substring with start index = 2 is "ab", which is an anagram of "ab".
 */

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        int[] sCount = new int[26];
        int[] pCount = new int[26];

        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            if (i >= p.length()) {
                sCount[s.charAt(i - p.length()) - 'a']--;
            }

            if (Arrays.equals(sCount, pCount)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }

    public List<Integer> findAnagrams1(String s, String p) {
        char[] sCh = s.toCharArray();
        char[] pCh = p.toCharArray();

        int slen = sCh.length, plen = pCh.length;

        int[] anagramChars = new int[128];
        for (int i = 0; i < plen; i++) {
            anagramChars[pCh[i]]++;
        }

        List<Integer> result = new ArrayList();

        for (int i = 0; i < slen; i++) {
            if (slen - i < plen) break;

            int[] tmpAnagram = new int[128];

            if (anagramChars[sCh[i]] > 0) {
                int j = i;
                for (; j < i + plen; j++) {
                    tmpAnagram[sCh[j]]++;

                    if (tmpAnagram[sCh[j]] > anagramChars[sCh[j]]) break;
                }

                if (j == i + plen) result.add(i);
            }
        }

        return result;
    }
}
