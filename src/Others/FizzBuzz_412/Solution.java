package Others.FizzBuzz_412;

import java.util.ArrayList;
import java.util.List;

/**
 412. Fizz Buzz
 https://leetcode.com/problems/fizz-buzz/description/

 Write a program that outputs the string representation of numbers from 1 to n.

 But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

 Example:
 n = 15,

 Return:
 [ "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz" ]
 */

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> l = new ArrayList<>();
        for(int i = 1; i<= n; i++){
            if(i%15==0){
                l.add("FizzBuzz");
            }
            else if(i%3==0){
                l.add("Fizz");
            }
            else if(i%5 == 0){
                l.add("Buzz");
            }
            else{
                l.add(Integer.toString(i));
            }
        }
        return l;
    }

    public List<String> fizzBuzzUniversal(int n) {
        List<String> l = new ArrayList<>();
        String str;
        for(int i = 1; i<= n; i++){
            str = "";
            if (i%3==0){
                str += "Fizz";
            }
            if (i%5==0){
                str += "Buzz";
            }
            if (str==""){
                str += i;
            }
            l.add(str);
        }
        return l;
    }

}
