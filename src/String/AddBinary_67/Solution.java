package String.AddBinary_67;

/**
 67. Add Binary

 Given two binary strings, return their sum (also a binary string).
 The input strings are both non-empty and contains only characters 1 or 0.

 Example 1:
 Input: a = "11", b = "1"
 Output: "100"

 Example 2:
 Input: a = "1010", b = "1011"
 Output: "10101"

 Constraints:
 Each string consists only of '0' or '1' characters.
 1 <= a.length, b.length <= 10^4
 Each string is either "0" or doesn't contain any leading zero.
 */

public class Solution {
    int addNext = 0;

    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1;

        String result = "";

        while (i >= 0 || j >= 0) {
            if (i < 0) {
                result = sumTwoChars(b.charAt(j--), '0') + result;
                continue;
            }

            if (j < 0) {
                result = sumTwoChars(a.charAt(i--), '0') + result;
                continue;
            }

            result = sumTwoChars(a.charAt(i--), b.charAt(j--)) + result;
        }

        return (addNext == 1 ? "1" : "") + result;
    }

    public String sumTwoChars(char a, char b)
    {
        if (a == '1' && b == '1') {
            if (addNext == 0) {
                addNext = 1;
                return "0";
            } else {
                return "1";
            }
        }

        if (a == '0' && b == '0') {
            if (addNext == 0) {
                return "0";
            } else {
                addNext = 0;
                return "1";
            }
        }

        return addNext == 1 ? "0" : "1";
    }
}
