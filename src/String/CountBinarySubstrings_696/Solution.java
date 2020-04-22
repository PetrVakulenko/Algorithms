package String.CountBinarySubstrings_696;

/**
 696. Count Binary Substrings

 Give a string s, count the number of non-empty (contiguous) substrings that have the same number of 0's and 1's,
   and all the 0's and all the 1's in these substrings are grouped consecutively.
 Substrings that occur multiple times are counted the number of times they occur.

 Example 1:
 Input: "00110011"
 Output: 6
 Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
 Notice that some of these substrings repeat and are counted the number of times they occur.
 Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.

 Example 2:
 Input: "10101"
 Output: 4
 Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.

 Note:
 s.length will be between 1 and 50,000.
 s will only consist of "0" or "1" characters.
 */

public class Solution {
    public int countBinarySubstrings(String s) {
        int zeros = 0;
        int ones = 0;
        char[] chars = s.toCharArray();

        int result = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                if (i > 0 && chars[i-1] == '1') {
                    result += Math.min(ones, zeros);
                    zeros = 1;
                } else {
                    zeros++;
                }
            } else {
                if (i > 0 && chars[i-1] == '0') {
                    result += Math.min(ones, zeros);
                    ones = 1;
                } else {
                    ones++;
                }
            }

            if (i == chars.length - 1) {
                result += Math.min(ones, zeros);
            }
        }

        return result;
    }
}
