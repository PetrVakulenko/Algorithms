package Math.Base7_504;

/**
 504. Base 7

 Given an integer, return its base 7 string representation.

 Example 1:
 Input: 100
 Output: "202"

 Example 2:
 Input: -7
 Output: "-10"

 Note: The input will be in range of [-1e7, 1e7].
 */

public class Solution {
    public String convertToBase7(int num) {
        int exponent = 0;
        String res = "";
        boolean neg = num < 0 ? true : false;

        if (num == 0) {
            return Integer.toString(0);
        }

        if (neg) {
            num *= -1;
        }

        while (num > 0) {
            res = (num % 7) + res;
            num /= 7;
        }

        return neg ? "-" + res : res;
    }
}
