package String.AddStrings_415;

/**
 415. Add Strings

 Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

 Note:
 The length of both num1 and num2 is < 5100.
 Both num1 and num2 contains only digits 0-9.
 Both num1 and num2 does not contain any leading zero.
 You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */

public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            int digitSum = carry;
            if (i >= 0)
                digitSum += num1.charAt(i) - '0';
            if (j >= 0)
                digitSum += num2.charAt(j) - '0';
            res.append(digitSum % 10);
            carry = digitSum / 10;
            i--;
            j--;
        }
        if (carry != 0) {
            res.append(carry);
        }
        return res.reverse().toString();
    }
}
