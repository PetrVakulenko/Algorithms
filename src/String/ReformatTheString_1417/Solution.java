package String.ReformatTheString_1417;

import java.util.ArrayList;
import java.util.List;

/**
 1417. Reformat The String

 Given alphanumeric string s. (Alphanumeric string is a string consisting of lowercase English letters and digits).
 You have to find a permutation of the string where no letter is followed by another letter and no digit is
   followed by another digit. That is, no two adjacent characters have the same type.
 Return the reformatted string or return an empty string if it is impossible to reformat the string.

 Example 1:
 Input: s = "a0b1c2"
 Output: "0a1b2c"
 Explanation: No two adjacent characters have the same type in "0a1b2c". "a0b1c2", "0a1b2c", "0c2a1b" are also valid permutations.

 Example 2:
 Input: s = "leetcode"
 Output: ""
 Explanation: "leetcode" has only characters so we cannot separate them by digits.

 Example 3:
 Input: s = "1229857369"
 Output: ""
 Explanation: "1229857369" has only digits so we cannot separate them by characters.

 Example 4:
 Input: s = "covid2019"
 Output: "c2o0v1i9d"

 Example 5:
 Input: s = "ab123"
 Output: "1a2b3"

 Constraints:
 1 <= s.length <= 500
 s consists of only lowercase English letters and/or digits.
 */

public class Solution {
    public String reformat(String s) {
        List<Character> characters = new ArrayList();
        List<Character> numerics = new ArrayList();

        for (char ch: s.toCharArray()) {
            if (ch >= 48 && ch <= 57) {
                numerics.add(ch);
            } else {
                characters.add(ch);
            }
        }

        int numSize = numerics.size();
        int chSize = characters.size();

        if (Math.abs(numSize - chSize) > 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        if (numSize > chSize) {
            for (int i = 0; i < chSize; i++) {
                sb.append(numerics.get(i));
                sb.append(characters.get(i));
            }
            sb.append(numerics.get(numSize - 1));
        } else if (chSize > numSize) {
            for (int i = 0; i < numSize; i++) {
                sb.append(characters.get(i));
                sb.append(numerics.get(i));
            }
            sb.append(characters.get(chSize - 1));
        } else {
            for (int i = 0; i < numSize; i++) {
                sb.append(characters.get(i));
                sb.append(numerics.get(i));
            }
        }

        return sb.toString();
    }
}