package String.BackspaceStringCompare_844;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 844. Backspace String Compare

 Given two strings S and T, return if they are equal when both are typed into empty text editors.
 # means a backspace character.

 Example 1:
 Input: S = "ab#c", T = "ad#c"
 Output: true
 Explanation: Both S and T become "ac".

 Example 2:
 Input: S = "ab##", T = "c#d#"
 Output: true
 Explanation: Both S and T become "".

 Example 3:
 Input: S = "a##c", T = "#a#c"
 Output: true
 Explanation: Both S and T become "c".

 Example 4:
 Input: S = "a#c", T = "b"
 Output: false
 Explanation: S becomes "c" while T becomes "b".

 Note:
 1 <= S.length <= 200
 1 <= T.length <= 200
 S and T only contain lowercase letters and '#' characters.

 Follow up:
 Can you solve it in O(N) time and O(1) space?
 */

public class Solution {
    public boolean backspaceCompare(String S, String T)
    {
        int tmpS = 0;
        int tmpT = 0;
        int indexS = S.length() - 1;
        int indexT = T.length() - 1;
        while(indexS >= 0 || indexT >= 0){
            while(indexS >= 0 && (S.charAt(indexS) == '#' || tmpS > 0)){
                if(S.charAt(indexS) == '#')
                    tmpS++;
                else
                    tmpS--;
                indexS--;
            }
            while(indexT >= 0 && (T.charAt(indexT) == '#' || tmpT > 0)){
                if(T.charAt(indexT) == '#')
                    tmpT++;
                else
                    tmpT--;
                indexT--;
            }
            if(indexS == -1 && indexT == -1)
                return true;
            if(indexS == -1 || indexT == -1)
                return false;
            if(S.charAt(indexS) != T.charAt(indexT))
                return false;
            indexS--;
            indexT--;

        }

        return true;
    }

    public boolean backspaceCompare1(String S, String T)
    {
        S = backspace(S);
        T = backspace(T);

        return S.compareTo(T) == 0;
    }

    public String backspace(String str)
    {
        char[] chars = str.toCharArray();

        List<Character> result = new ArrayList();

        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '#') {
                if (index > 0) {
                    index--;
                    result.remove(index);
                }
                continue;
            }

            result.add(chars[i]);
            index++;
        }

        return result.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
