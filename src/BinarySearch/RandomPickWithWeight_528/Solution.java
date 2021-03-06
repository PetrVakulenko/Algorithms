package BinarySearch.RandomPickWithWeight_528;

import java.util.*;

/**
 528. Random Pick with Weight

 Given an array w of positive integers, where w[i] describes the weight of index i, write a function pickIndex which randomly picks an index in proportion to its weight.

 Note:
 1 <= w.length <= 10000
 1 <= w[i] <= 10^5
 pickIndex will be called at most 10000 times.

 Example 1:
 Input:
 ["Solution","pickIndex"]
 [[[1]],[]]
 Output: [null,0]

 Example 2:
 Input:
 ["Solution","pickIndex","pickIndex","pickIndex","pickIndex","pickIndex"]
 [[[1,3]],[],[],[],[],[]]
 Output: [null,0,1,1,1,0]

 Explanation of Input Syntax:
 The input is two lists: the subroutines called and their arguments. Solution's constructor has one argument, the array w. pickIndex has no arguments. Arguments are always wrapped with a list, even if there aren't any.
 */

public class Solution {
    int[] sum;
    Random rand;
    public Solution(int[] w) {
        for(int i=1;i<w.length;i++){
            w[i]+=w[i-1];
        }
        sum=w;
        rand=new Random();
    }

    public int pickIndex() {
        int index=rand.nextInt(sum[sum.length-1])+1;
        int left=0,right=sum.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(sum[mid]<index)
                left=mid+1;
            else
                right=mid;
        }

        return left;
    }
}
