package String.LongPressedName_925;

/**
 925. Long Pressed Name

 Your friend is typing his name into a keyboard.  Sometimes, when typing a character c, the key might get long pressed,
   and the character will be typed 1 or more times.
 You examine the typed characters of the keyboard.
 Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

 Example 1:
 Input: name = "alex", typed = "aaleex"
 Output: true
 Explanation: 'a' and 'e' in 'alex' were long pressed.

 Example 2:
 Input: name = "saeed", typed = "ssaaedd"
 Output: false
 Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.

 Example 3:
 Input: name = "leelee", typed = "lleeelee"
 Output: true

 Example 4:
 Input: name = "laiden", typed = "laiden"
 Output: true
 Explanation: It's not necessary to long press any character.

 Constraints:
 1 <= name.length <= 1000
 1 <= typed.length <= 1000
 The characters of name and typed are lowercase letters.
 */

public class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if (name.equals(typed)) return true;
        if (name.length() > typed.length()) return false;

        char[] c1 = name.toCharArray();
        char[] c2 = typed.toCharArray();
        if (c1[0] != c2[0]) return false;
        if (c1[c1.length -1] != c2[c2.length -1]) return false;

        int i=0; int j=0;

        while (i<c1.length && j<c2.length) {
            if (c1[i] == c2[j]) {
                i++; j++;
            }
            else if (i!=0 && c1[i-1]!=c2[j])  {
                return false;
            }
            else {
                while (j<c2.length && c1[i] != c2[j] && i!=0 && c1[i-1] == c2[j])
                    j++;
            }

        }
        if (i>=c1.length) return true;

        return false;
    }
}