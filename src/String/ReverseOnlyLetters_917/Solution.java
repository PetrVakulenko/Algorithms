package String.ReverseOnlyLetters_917;

/**
 917. Reverse Only Letters
 https://leetcode.com/problems/reverse-only-letters/

 Given a string S, return the "reversed" string where all characters
    that are not a letter stay in the same place, and all letters reverse their positions.

 Example 1:
 Input: "ab-cd"
 Output: "dc-ba"

 Example 2:
 Input: "a-bC-dEf-ghIj"
 Output: "j-Ih-gfE-dCba"

 Example 3:
 Input: "Test1ng-Leet=code-Q!"
 Output: "Qedo1ct-eeLg=ntse-T!"

 Note:
 S.length <= 100
 33 <= S[i].ASCIIcode <= 122
 S doesn't contain \ or "
 */

public class Solution {
    public String reverseOnlyLetters(String S) {
        char[] letters = S.toCharArray();
        char tmp;
        int i = 0, j = S.toCharArray().length - 1;

        while(i <= j) {
            System.out.println(i + " " + j);
            if ((letters[i] < 'A' || letters[i] > 'Z') && (letters[i] < 'a' || letters[i] > 'z')) {
                i++;

                continue;
            }
            if ((letters[j] < 'A' || letters[j] > 'Z') && (letters[j] < 'a' || letters[j] > 'z')) {
                j--;

                continue;
            }

            tmp = letters[i];
            letters[i] = letters[j];
            letters[j] = tmp;
            i++;
            j--;
        }

        return new String(letters);
    }
}
