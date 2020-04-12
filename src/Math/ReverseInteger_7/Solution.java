package Math.ReverseInteger_7;

import java.util.ArrayList;
import java.util.List;

/**
 7. Reverse Integer

 Given a 32-bit signed integer, reverse digits of an integer.

 Example 1:
 Input: 123
 Output: 321

 Example 2:
 Input: -123
 Output: -321

 Example 3:
 Input: 120
 Output: 21

 Note:
 Assume we are dealing with an environment which could only store integers within the 32-bit
   signed integer range:[−231,  231 − 1].
 For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */

public class Solution {
    public int reverse(int x) {
        List<Integer> numbers = new ArrayList();

        int sign = 1;
        if (x < 0) {
            sign = -1;
            x *= sign;
        }

        while (x > 0) {
            numbers.add(x % 10);

            x=x/10;
        }

        int result = 0, size = numbers.size();

        for (int i = 0; i < size; i++) {
            result += Math.pow(10, size - 1 - i) * numbers.get(i);
            if (result >= Integer.MAX_VALUE) return 0;
        }

        return result * sign;
    }
}
