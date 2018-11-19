package String.letterCasePermutation_784;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.*;

/**
 784. Letter Case Permutation
 https://leetcode.com/problems/letter-case-permutation/description/

 Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.
 Return a list of all possible strings we could create.

 Examples:
 Input: S = "a1b2"
 Output: ["a1b2", "a1B2", "A1b2", "A1B2"]

 Input: S = "3z4"
 Output: ["3z4", "3Z4"]

 Input: S = "12345"
 Output: ["12345"]

 Note:
 S will be a string with length between 1 and 12.
 S will consist only of letters or digits.
 */

public class Solution {
    public List<String> letterCasePermutation(String S) {
        int length = S.length(), count, length1, i, j;
        String help = "";
        char ch[], ch1;

        Set<String> l = new HashSet<>();

        if (length == 0) {
            l.add("");
            return new ArrayList<>(l);
        }

        for(i=0; i < length; i++) {
            help += "1";
        }

        count = Integer.parseInt(help, 2);

        for(i=0; i<=count; i++) {
            ch = S.toLowerCase().toCharArray();

            help = Integer.toString(i, 2);

            length1 = length - help.length();

            for (j = length1; j < length; j++) {
                ch1 = ch[j];
                if(ch1 >= '0' && ch1 <= '9') continue;
                ch[j] = help.charAt(j - length1) == '1' ? (char) (ch1 - 'a'+'A') : ch1;
            }

            l.add(new String(ch));
        }

        return new ArrayList<>(l);
    }
}