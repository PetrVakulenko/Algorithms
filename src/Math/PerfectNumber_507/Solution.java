package Math.PerfectNumber_507;

/**
 507. Perfect Number

 We define the Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.
 Now, given an integer n, write a function that returns true when it is a perfect number and false when it is not.

 Example:
 Input: 28
 Output: True
 Explanation: 28 = 1 + 2 + 4 + 7 + 14

 Note: The input number n will not exceed 100,000,000. (1e8)
 */

public class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num < 3) return false;

        // get all divisors
        int sum = 1;
        int i;
        for (i = 2; i <= (num/i); i++) {
            if (num % i == 0) {
                if (i == (num/i)) {
                    sum += i;
                } else {
                    sum += i + (num/i);
                }
            }
        }

        return(sum == num);
    }

    public boolean checkPerfectNumber1(int num) {
        if (num == 1) return false;

        int result = 1;

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) result+=i;
        }

        return result == num;
    }
}
