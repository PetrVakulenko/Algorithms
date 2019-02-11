package String.ComplexNumberMultiplication_537;

import java.util.Arrays;

/**
 537. Complex Number Multiplication
 https://leetcode.com/problems/complex-number-multiplication/

 Given two strings representing two complex numbers.
 You need to return a string representing their multiplication. Note i2 = -1 according to the definition.

 Example 1:
 Input: "1+1i", "1+1i"
 Output: "0+2i"
 Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.

 Example 2:
 Input: "1+-1i", "1+-1i"
 Output: "0+-2i"
 Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.

 Note:
 The input strings will not have extra blank.
 The input strings will be given in the form of a+bi,
    where the integer a and b will both belong to the range of [-100, 100].
    And the output should be also in this form.

 */

public class Solution {
    public String complexNumberMultiply(String a, String b) {
        String[] ar = a.split("\\+");
        String[] br = b.split("\\+");
        int a1 = Integer.parseInt(ar[0]);
        int a2 = Integer.parseInt(ar[1].substring(0, ar[1].length()-1));
        int b1 = Integer.parseInt(br[0]);
        int b2 = Integer.parseInt(br[1].substring(0, br[1].length()-1));
        int s1 = a1*b1 + -1*a2*b2;
        int s2 = a1*b2 + b1*a2;

        return String.valueOf(s1)+"+"+String.valueOf(s2)+"i";
    }

    public String complexNumberMultiply1(String a, String b) {
        String[] aArr = a.split("\\+");
        String[] bArr = b.split("\\+");

        int i, j, tmp, tmp3, index = 0;

        String[] resArr = new String[aArr.length + bArr.length];

        for(i = 0; i < aArr.length; i++) {
            for(j = 0; j < bArr.length; j++){
                tmp = 0;

                if (aArr[i].indexOf('i') != -1) tmp++;
                if (bArr[j].indexOf('i') != -1) tmp++;

                tmp3 = Integer.parseInt(aArr[i].replace("i", "")) *
                        Integer.parseInt(bArr[j].replace("i", ""));

                if (tmp == 1) {
                    resArr[index] = Integer.toString(tmp3) + 'i';
                } else if (tmp == 2) {
                    tmp3 *= -1;
                    resArr[index] = Integer.toString(tmp3);
                } else {
                    resArr[index] = Integer.toString(tmp3);
                }

                index++;
            }
        }

        // 0 elem for integer number, 1 elem for complex number
        int[] temporary = new int[2];

        for (i = 0; i < resArr.length; i++) {
            if (resArr[i].indexOf('i') != -1) {
                temporary[1] += Integer.parseInt(resArr[i].replace("i", ""));
            } else {
                temporary[0] += Integer.parseInt(resArr[i]);
            }
        }

        return temporary[0] + "+" + temporary[1] + "i";
    }
}
