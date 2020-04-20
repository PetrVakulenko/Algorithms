package Math.UglyNumber_263;

import java.util.ArrayList;
import java.util.List;

/**
 263. Ugly Number

 Write a program to check whether a given number is an ugly number.
 Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.

 Example 1:
 Input: 6
 Output: true
 Explanation: 6 = 2 × 3

 Example 2:
 Input: 8
 Output: true
 Explanation: 8 = 2 × 2 × 2

 Example 3:
 Input: 14
 Output: false
 Explanation: 14 is not ugly since it includes another prime factor 7.

 Note:
 1 is typically treated as an ugly number.
 Input is within the 32-bit signed integer range: [−231,  231 − 1].
 */

public class Solution {
    public boolean isUgly(int num) {
        while(num > 1 && num %2 == 0){
            num /= 2;
        }

        while(num > 1 && num %3 == 0){
            num /= 3;
        }

        while(num > 1 && num %5 == 0){
            num /= 5;
        }

        if(num == 1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isUgly1(int num) {
        if (num < 1) return false;

        List<Integer> dividors = getDividors(num);

        for (int i = 0; i < dividors.size(); i++) {
            int x = dividors.get(i);

            if (x != 2 && x != 3 && x != 5) return false;
        }

        return true;
    }

    public List<Integer> getDividors(int n)
    {
        List<Integer> result = new ArrayList();

        int a = 2;
        while (a <= n) {
            if ((n % a) == 0) {
                result.add(a);
                if (a != n) {
                    result.addAll(getDividors(n / a));
                }

                return result;
            }
            a++;
        }

        return result;
    }
}
