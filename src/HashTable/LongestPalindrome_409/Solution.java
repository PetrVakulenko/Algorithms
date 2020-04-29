package HashTable.LongestPalindrome_409;

/**
 409. Longest Palindrome

 Given a string which consists of lowercase or uppercase letters,
   find the length of the longest palindromes that can be built with those letters.
 This is case sensitive, for example "Aa" is not considered a palindrome here.

 Note:
 Assume the length of given string will not exceed 1,010.

 Example:
 Input:
 "abccccdd"
 Output:
 7

 Explanation:
 One longest palindrome that can be built is "dccaccd", whose length is 7.
 */

class Solution {
    public int longestPalindrome(String s) {
        int[] letters = new int[128];

        int oneletter = 0;
        int result = 0;

        for (char c: s.toCharArray()) {
            letters[c]++;

            if (letters[c] % 2 == 0) {
                result+=2;
                oneletter--;
            } else {
                oneletter++;
            }
        }

        return result + (oneletter > 0 ? 1 : 0);
    }
}