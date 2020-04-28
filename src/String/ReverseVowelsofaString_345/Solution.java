package String.ReverseVowelsofaString_345;

/**
 345. Reverse Vowels of a String

 Write a function that takes a string as input and reverse only the vowels of a string.

 Example 1:
 Input: "hello"
 Output: "holle"

 Example 2:
 Input: "leetcode"
 Output: "leotcede"

 Note:
 The vowels does not include the letter "y".
 */

public class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (!isVowel(chars[i])) {
                i++;
            }
            if (!isVowel(chars[j])) {
                j--;
            }
            if (isVowel(chars[i]) && isVowel(chars[j])) {
                char tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;
                i++;
                j--;
            }
        }

        return new String(chars);
    }

    private boolean isVowel(char c)
    {
        if (c == 'a' || c == 'A') return true;
        if (c == 'e' || c == 'E') return true;
        if (c == 'i' || c == 'I') return true;
        if (c == 'o' || c == 'O') return true;
        if (c == 'u' || c == 'U') return true;
        return false;
    }
}
