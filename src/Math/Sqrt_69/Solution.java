package Math.Sqrt_69;

/**
 69. Sqrt(x)

 Implement int sqrt(int x).
 Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

 Example 1:
 Input: 4
 Output: 2

 Example 2:
 Input: 8
 Output: 2
 Explanation: The square root of 8 is 2.82842..., and since
 the decimal part is truncated, 2 is returned.
 */

public class Solution {
    public int mySqrt1(int x) {
        return (int) Math.floor(Math.sqrt(x));
    }

    public int mySqrt(int x) {
        if (x == 0)
            return 0;

        // a virtual sequence 1 -> x
        int mid = 1, left = 1, right = x;
        while (left <= right) {
            mid = left + (right - left) / 2;

            if (mid == x / mid)
                return mid;
            if (mid < x / mid)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return right;
    }
}
