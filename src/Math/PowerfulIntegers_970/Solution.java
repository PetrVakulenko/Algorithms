package Math.PowerfulIntegers_970;

import java.util.*;

/**
 970. Powerful Integers

 Given two positive integers x and y, an integer is powerful if it is equal to x^i + y^j for some integers i >= 0 and j >= 0.
 Return a list of all powerful integers that have value less than or equal to bound.
 You may return the answer in any order.  In your answer, each value should occur at most once.

 Example 1:
 Input: x = 2, y = 3, bound = 10
 Output: [2,3,4,5,7,9,10]
 Explanation:
 2 = 2^0 + 3^0
 3 = 2^1 + 3^0
 4 = 2^0 + 3^1
 5 = 2^1 + 3^1
 7 = 2^2 + 3^1
 9 = 2^3 + 3^0
 10 = 2^0 + 3^2

 Example 2:
 Input: x = 3, y = 5, bound = 15
 Output: [2,4,6,8,10,14]

 Note:
 1 <= x <= 100
 1 <= y <= 100
 0 <= bound <= 10^6
 */

public class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> ans=new ArrayList<>();
        if(x==1){
            if(y==1){
                if(bound>=2) ans.add(2);

                return ans;
            } else {
                return Only1(y,bound);
            }
        } else if (y==1) {
            return Only1(x,bound);
        }

        int num1=1;
        int num2=1;
        while(num1<bound){
            num2=1;
            while(num1+num2<=bound){
                if(ans.indexOf(num1+num2)==-1) ans.add(num1+num2);
                num2=num2*y;
            }
            num1=num1*x;
        }

        return ans;
    }

    public List<Integer> Only1(int n,int bound){
        List<Integer> ans=new ArrayList<>();
        int num1=1;
        while(num1+1<=bound){
            if(ans.indexOf(num1+1)==-1)
                ans.add(num1+1);
            num1=num1*n;
        }
        return ans;
    }
}
