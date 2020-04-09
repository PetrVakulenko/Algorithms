package String.ValidAnagram_242;

import java.util.Arrays;

/**
 242. Valid Anagram

 Given two strings s and t , write a function to determine if t is an anagram of s.

 Example 1:
 Input: s = "anagram", t = "nagaram"
 Output: true

 Example 2:
 Input: s = "rat", t = "car"
 Output: false

 Note:
 You may assume the string contains only lowercase alphabets.

 Follow up:
 What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int len = s.length();

        char[] str1 = s.toCharArray();
        Arrays.sort(str1);

        char[] str2 = t.toCharArray();
        Arrays.sort(str2);

        for (int i = 0; i < len; i++) {
            if (str1[i] != str2[i]) return false;
        }

        return true;
    }

    public boolean isAnagram1(String s, String t) {
        int len = s.length();

        int[] found = new int[len];

        for (int i = 0; i < len; i++) {
            char tmp = s.charAt(i);

            for (int j = 0; j < t.length(); j++) {
                if (found[j] == 0 && t.charAt(j) == tmp) {
                    t = t.substring(0, j) + (j < t.length() - 1 ? t.substring(j+1) : "");
                    break;
                }
            }

            if (t.length() != len - i - 1) {
                return false;
            }
        }

        return t.compareTo("") == 0;
    }
}
