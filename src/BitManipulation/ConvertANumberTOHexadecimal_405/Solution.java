package BitManipulation.ConvertANumberTOHexadecimal_405;

/**
 405. Convert a Number to Hexadecimal

 Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.

 Note:
 All letters in hexadecimal (a-f) must be in lowercase.
 The hexadecimal string must not contain extra leading 0s. If the number is zero, it is represented by a single zero character '0'; otherwise, the first character in the hexadecimal string will not be the zero character.
 The given number is guaranteed to fit within the range of a 32-bit signed integer.
 You must not use any method provided by the library which converts/formats the number to hex directly.

 Example 1:
 Input:
 26
 Output:
 "1a"

 Example 2:
 Input:
 -1
 Output:
 "ffffffff"
 */

public class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        StringBuilder sb = new StringBuilder();

        long x = num;
        if(x < 0){
            x = 1 + (((1L<<32) - 1)^(-x));
        }

        while (x > 0) {
            long div = x % 16;

            if (div == 10) sb.append('a');
            if (div == 11) sb.append('b');
            if (div == 12) sb.append('c');
            if (div == 13) sb.append('d');
            if (div == 14) sb.append('e');
            if (div == 15) sb.append('f');
            if (div < 10) sb.append(div);

            x /= 16;
        }

        return sb.reverse().toString();
    }
}
