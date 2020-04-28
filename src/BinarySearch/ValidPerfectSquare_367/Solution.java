package BinarySearch.ValidPerfectSquare_367;

/**
 367. Valid Perfect Square

 Given a positive integer num, write a function which returns True if num is a perfect square else False.

 Note: Do not use any built-in library function such as sqrt.

 Example 1:
 Input: 16
 Output: true

 Example 2:
 Input: 14
 Output: false
 */

class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 0) return true;

        return mySqrt(num);
    }

    public boolean mySqrt(int x) {
        if (x == 0) return false;

        int mid = 1, left = 1, right = x;
        while (left <= right) {
            mid = left + (right - left) / 2;

            if (mid == x / mid) {
                if (x % mid == 0) return true;

                return false;
            }
            if (mid < x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}