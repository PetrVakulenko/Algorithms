package String.SelfDividingNumbers_728;

import java.util.List;
import java.util.ArrayList;

/**
 728. Self Dividing Numbers
 https://leetcode.com/problems/self-dividing-numbers/description/

 A self-dividing number is a number that is divisible by every digit it contains.

 For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

 Also, a self-dividing number is not allowed to contain the digit zero.

 Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

 Example 1:
 Input:
 left = 1, right = 22
 Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]

 */

public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List list = new ArrayList<Integer>();

        for(int i = left; i <= right; i++){
            if (this.selfDividingCheck(i)){
                list.add(i);
            }
        }

        return list;
    }

    private boolean selfDividingCheck(int num){
        for (char c: String.valueOf(num).toCharArray()){
            if (c == '0' || num % (c - '0') > 0){
                return false;
            }
        }
        return true;
    }
}
