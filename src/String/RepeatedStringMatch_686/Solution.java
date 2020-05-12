package String.RepeatedStringMatch_686;

import java.util.Arrays;
import java.util.Comparator;

/**
 686. Repeated String Match

 Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it.
   If no such solution, return -1.
 For example, with A = "abcd" and B = "cdabcdab".
 Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring of it; and B is not a substring of
   A repeated two times ("abcdabcd").

 Note:
 The length of A and B will be between 1 and 10000.
 */

public class Solution {
    public int repeatedStringMatch(String A, String B) {
        int nA = A.length(), nB = B.length();
        int firstAinB = B.indexOf(A);

        if (nA > nB) {
            return (A.indexOf(B) == -1)? (((A+A).indexOf(B) == -1 )? -1 : 2) : 1;
        }

        if (firstAinB == -1 || firstAinB > nA) {
            return ((A+A).indexOf(B) == -1)? -1 : 2;
        }

        StringBuilder sb = new StringBuilder();
        int count = 0;
        if (firstAinB > 0) {
            count++;
            sb.append(A.substring(nA - firstAinB,nA));
        }
        int secondAinB = (nB - firstAinB) % nA;
        int num_full_A = (nB - firstAinB) / nA;
        while (num_full_A-- > 0) {
            sb.append(A);
            count++;
        }
        if (secondAinB > 0) {
            sb.append(A.substring(0, secondAinB));
            count++;
        }

        return (sb.toString().equals(B))? count : -1;
    }
}