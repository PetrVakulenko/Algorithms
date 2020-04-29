package String.NumberofSegmentsinaString_434;

/**
 434. Number of Segments in a String

 Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
 Please note that the string does not contain any non-printable characters.

 Example:
 Input: "Hello, my name is John"
 Output: 5
 */

public class Solution {
    public int countSegments(String s) {
        char[] chars = s.toCharArray();

        int result = 0;

        boolean prevSpace = true;

        for (int i = 0; i < chars.length; i++) {
            if (prevSpace && chars[i] != ' ') result++;

            if (chars[i] == ' ') prevSpace = true;
            else prevSpace = false;
        }

        return result;
    }
}