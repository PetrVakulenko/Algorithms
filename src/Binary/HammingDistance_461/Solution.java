package Binary.HammingDistance_461;
/**
 461. Hamming Distance
 https://leetcode.com/problems/hamming-distance/description/

 The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

 Given two integers x and y, calculate the Hamming distance.

 Note:
 0 ≤ x, y < 231.

 Example:
 Input: x = 1, y = 4
 Output: 2

 Explanation:
 1   (0 0 0 1)
 4   (0 1 0 0)
        ↑   ↑

 The above arrows point to positions where the corresponding bits are different.
 */

public class Solution {
    public int hammingDistance(int x, int y) {
        String x_bin = Integer.toBinaryString(x);
        String y_bin = Integer.toBinaryString(y);
        int result = 0;

        if (x_bin.length() > y_bin.length()){
            String temp = x_bin;
            x_bin = y_bin;
            y_bin = temp;
        }

        int xlen = x_bin.length();
        int ylen = y_bin.length();

        for(int i = 0; i < ylen - xlen; i++){
            x_bin = "0"+x_bin;
        }

        for (int i = 0; i < x_bin.length(); i++){
            if (x_bin.charAt(i) != y_bin.charAt(i)){
                result++;
            }
        }

        return result;
    }
}
