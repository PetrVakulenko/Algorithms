package String.RepeatedSubstringPattern_459;

import java.util.Arrays;
import java.util.Comparator;

/**
 459. Repeated Substring Pattern

 Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies
   of the substring together. You may assume the given string consists of lowercase English letters only and its
   length will not exceed 10000.

 Example 1:
 Input: "abab"
 Output: True
 Explanation: It's the substring "ab" twice.

 Example 2:
 Input: "aba"
 Output: False

 Example 3:
 Input: "abcabcabcabc"
 Output: True
 Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
 */

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length()/2; i++) {
            sb.append(s.charAt(i));
            String temp = sb.toString();
            while(temp.length() <= s.length()){
                if(temp.equals(s)) return true;
                temp += sb.toString();
            }
        }
        return false;
    }
}