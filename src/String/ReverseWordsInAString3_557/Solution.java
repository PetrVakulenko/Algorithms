package String.ReverseWordsInAString3_557;

import org.jetbrains.annotations.NotNull;

/**
 557. Reverse Words in a String III
 https://leetcode.com/problems/reverse-words-in-a-string-iii/description/

 Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 Example 1:
 Input: "Let's take LeetCode contest"
 Output: "s'teL ekat edoCteeL tsetnoc"
 Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */

public class Solution {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        int l = strings.length-1;
        for(int i = 0; i <= l; i++){
            strings[i] = this.reverseString(strings[i]);
        }
        return String.join(" ", strings);
    }

    private String reverseString(String s) {
        char[] c = s.toCharArray();
        int l = c.length-1;
        int mid = (l+1)/2;
        char t;
        for(int i=0; i<mid; i++){
            t = c[i];
            c[i] = c[l-i];
            c[l-i] = t;
        }
        return String.valueOf(c);
    }
}
