package BinarySearch.GuessNumberHigherOrLower_374;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 374. Guess Number Higher or Lower

 We are playing the Guess Game. The game is as follows:
 I pick a number from 1 to n. You have to guess which number I picked.
 Every time you guess wrong, I'll tell you whether the number is higher or lower.
 You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):
 -1 : My number is lower
 1 : My number is higher
 0 : Congrats! You got it!

 Example :
 Input: n = 10, pick = 6
 Output: 6
 */

public class Solution {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right-left)/2;
            int g = guess(mid);

            if(g == -1){
                right = mid;
            }else if(g == 1){
                left = mid+1;
            }else{
                return mid;
            }
        }

        return 0;
    }

    private int guess(int num)
    {
        return 0;
    }
}
