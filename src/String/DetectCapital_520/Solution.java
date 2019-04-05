package String.DetectCapital_520;

/**
 520. Detect Capital
 https://leetcode.com/problems/detect-capital/

 Given a word, you need to judge whether the usage of capitals in it is right or not.
 We define the usage of capitals in a word to be right when one of the following cases holds:
 All letters in this word are capitals, like "USA".
 All letters in this word are not capitals, like "leetcode".
 Only the first letter in this word is capital if it has more than one letter, like "Google".
 Otherwise, we define that this word doesn't use capitals in a right way.

 Example 1:
 Input: "USA"
 Output: True

 Example 2:
 Input: "FlaG"
 Output: False

 Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
 */

public class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) return true;

        char[] letters = word.toCharArray();

        boolean capital = letters[0] >= 'A' && letters[0] <= 'Z', uppercase = letters[1] >= 'A' && letters[1] <= 'Z';

        if (!capital && uppercase) return false;

        int i = 2, j = word.toCharArray().length - 1;

        while(i <= j) {
            if ((letters[i] >= 'A' && letters[i] <= 'Z' || letters[j] >= 'A' && letters[j] <= 'Z') && !uppercase) return false;
            if ((letters[i] >= 'a' && letters[i] <= 'z' || letters[j] >= 'a' && letters[j] <= 'z') && uppercase) return false;

            i++;
            j--;
        }

        return true;
    }
}
