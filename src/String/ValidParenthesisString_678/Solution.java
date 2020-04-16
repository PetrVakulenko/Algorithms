package String.ValidParenthesisString_678;

import java.util.Stack;

/**
 678. Valid Parenthesis String

 Given a string containing only three types of characters: '(', ')' and '*',
   write a function to check whether this string is valid. We define the validity of a string by these rules:
 Any left parenthesis '(' must have a corresponding right parenthesis ')'.
 Any right parenthesis ')' must have a corresponding left parenthesis '('.
 Left parenthesis '(' must go before the corresponding right parenthesis ')'.
 '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
 An empty string is also valid.

 Example 1:
 Input: "()"
 Output: True

 Example 2:
 Input: "(*)"
 Output: True

 Example 3:
 Input: "(*))"
 Output: True
 */

public class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> st = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();

        char[] chars = s.toCharArray();

        for(int i=0; i < chars.length; i++){
            if(chars[i] == '(') {
                st.push(i);
            } else if(chars[i] == '*') {
                s2.push(i);
            } else {
                if(st.isEmpty() && s2.isEmpty()) {
                    return false;
                } else if(!st.isEmpty()) {
                    st.pop();
                } else {
                    s2.pop();
                }
            }
        }

        while(!st.isEmpty() && !s2.isEmpty()){
            if(st.peek() < s2.pop()) {
                st.pop();
            }
        }

        return st.isEmpty();
    }

    public boolean checkValidString1(String s) {
        int lo = 0, hi = 0;
        for (char c: s.toCharArray()) {
            lo += c == '(' ? 1 : -1;
            hi += c != ')' ? 1 : -1;
            if (hi < 0) break;
            lo = Math.max(lo, 0);
        }
        return lo == 0;
    }

    public boolean checkValidString2(String s) {
        char[] chars = s.toCharArray();

        int opened = 0;
        int stars = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') opened++;
            if (chars[i] == '*') stars++;
            if (chars[i] == ')') {
                if (opened == 0) {
                    if (stars == 0) return false;

                    if (stars > 0) stars--;
                }

                if (opened > 0) opened--;
                if (opened == 0) stars = 0;
            }
        }

        return opened - stars <= 0;
    }
}
