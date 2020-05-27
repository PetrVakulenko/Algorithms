package Math.PrimeArrangements_1175;

/**
 1175. Prime Arrangements

 Return the number of permutations of 1 to n so that prime numbers are at prime indices (1-indexed.)
 (Recall that an integer is prime if and only if it is greater than 1, and cannot be written as a product of two positive integers both smaller than it.)
 Since the answer may be large, return the answer modulo 10^9 + 7.

 Example 1:
 Input: n = 5
 Output: 12
 Explanation: For example [1,2,5,4,3] is a valid permutation, but [5,2,3,4,1] is not because the prime number 5 is at index 1.

 Example 2:
 Input: n = 100
 Output: 682289015

 Constraints:
 1 <= n <= 100
 */

public class Solution {
    boolean isPrime(int n) {
        if(n <= 1) return false;
        if(n <= 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;

        for(int i = 5; i * i <= n; i+=6){
            if(n % i == 0 || n % (i+2) == 0) return false;
        }

        return true;
    }

    public int numPrimeArrangements(int n) {
        int primtCount = 0;
        int mod = (int)(1e9+7);

        for(int i = 1; i <= n; i++) {
            if(isPrime(i)) primtCount++;
        }

        int nonPrime = n - primtCount;
        long fact[] = new long[n+1];
        fact[0] = 1;

        for(int i = 1; i <= n; i++){
            fact[i] = (fact[i-1] * i) % mod;
        }

        long ans = (fact[primtCount] * fact[nonPrime]) % mod;

        return (int)ans;

    }
}
