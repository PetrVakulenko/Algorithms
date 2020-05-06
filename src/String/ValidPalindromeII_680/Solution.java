package String.ValidPalindromeII_680;

/**
 680. Valid Palindrome II

 Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

 Example 1:
 Input: "aba"
 Output: True

 Example 2:
 Input: "abca"
 Output: True
 Explanation: You could delete the character 'c'.

 Note:
 The string will only contain lowercase characters a-z. The maximum length of the string is 50000.
 */

public class Solution {
    public boolean validPalindrome(String s) {
        int[] idx = getFailedIdx(0,s.length()-1,s);
        if (idx.length != 0) {
            return (getFailedIdx(idx[0] + 1, idx[1], s).length == 0 ||
                    getFailedIdx(idx[0],idx[1] - 1,s).length == 0);
        }
        return true;
    }

    public int[] getFailedIdx(int l, int r, String s) {
        do{
            if(s.charAt(l) != s.charAt(r)) {
                return new int[]{l,r};
            }
        } while(l++ < r--);
        return new int[0];
    }

    public boolean validPalindrome1(String s) {
        int i = 0, j = s.length() - 1;

        int missedChars = 0;
        while(i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else if (s.charAt(i) == s.charAt(j-1)) {
                j--;
                missedChars++;
            } else if (s.charAt(i+1) == s.charAt(j)) {
                i++;
                missedChars++;
            } else {
                return false;
            }

            if (missedChars > 1) return false;
        }

        return missedChars <= 1;
    }
}
