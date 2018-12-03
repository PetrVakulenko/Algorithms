package Math.BinaryGap_868;

/**
 868. Binary Gap
 https://leetcode.com/problems/binary-gap/description/

 Given a positive integer N, find and return the longest distance
    between two consecutive 1's in the binary representation of N.
 If there aren't two consecutive 1's, return 0.

 Example 1:
 Input: 22
 Output: 2
 Explanation:
 22 in binary is 0b10110.
 In the binary representation of 22, there are three ones, and two consecutive pairs of 1's.
 The first consecutive pair of 1's have distance 2.
 The second consecutive pair of 1's have distance 1.
 The answer is the largest of these two distances, which is 2.

 Example 2:
 Input: 5
 Output: 2
 Explanation:
 5 in binary is 0b101.

 Example 3:
 Input: 6
 Output: 1
 Explanation:
 6 in binary is 0b110.

 Example 4:
 Input: 8
 Output: 0
 Explanation:
 8 in binary is 0b1000.
 There aren't any consecutive pairs of 1's in the binary representation of 8, so we return 0.

 Note:
 1 <= N <= 10^9
 */

public class Solution {
    public int binaryGap(int N) {
        int res = 0, prev = -1, current = 0;
        while (N != 0) {
            if ((N & 1) == 1) {
                if (prev != -1 && current - prev > res) {
                    res = current - prev;
                }
                prev = current;
            }
            N /= 2;
            current++;
        }

        return res;
    }

    public int binaryGap1(int N) {
        String result = Integer.toBinaryString(N);

        int index = result.indexOf('1'), res = 0, previndex = -1;

        if (index < 0) {
            return 0;
        }

        while (index >=0){
            if (previndex != -1 && index - previndex > res) {
                res = index - previndex;
            }
            previndex = index;
            index = result.indexOf('1', index+1);
        }

        return res;
    }
}
