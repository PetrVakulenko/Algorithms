package String.ValidPalindrome_125;

/**
 125. Valid Palindrome

 Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 Note: For the purpose of this problem, we define empty string as valid palindrome.

 Example 1:
 Input: "A man, a plan, a canal: Panama"
 Output: true

 Example 2:
 Input: "race a car"
 Output: false
 */

public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        if(s != null && s.length() > 1){

            int i = 0, j = s.length() - 1;

            while (i < j) {
                char a = s.charAt(i);

                if ((a < 'a' || a > 'z') && (a < '0' || a > '9')) {
                    i++;
                    continue;
                }

                char b = s.charAt(j);

                if ((b < 'a' || b > 'z') && (b < '0' || b > '9')) {
                    j--;
                    continue;
                }

                if (a != b) return false;

                j--;
                i++;
            }
        }

        return true;
    }
}
