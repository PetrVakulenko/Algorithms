package Stack.RemoveOutermostParentheses_1021;

import java.util.Stack;

/**
 1021. Remove Outermost Parentheses

 A valid parentheses string is either empty (""), "(" + A + ")", or A + B,
   where A and B are valid parentheses strings, and + represents string concatenation.
 For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.

 A valid parentheses string S is primitive if it is nonempty, and there does not exist a way
   to split it into S = A+B, with A and B nonempty valid parentheses strings.

 Given a valid parentheses string S, consider its primitive decomposition:
   S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.

 Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.

 Example 1:
 Input: "(()())(())"
 Output: "()()()"
 Explanation:
 The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
 After removing outer parentheses of each part, this is "()()" + "()" = "()()()".

 Example 2:
 Input: "(()())(())(()(()))"
 Output: "()()()()(())"
 Explanation:
 The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
 After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".

 Example 3:
 Input: "()()"
 Output: ""
 Explanation:
 The input string is "()()", with primitive decomposition "()" + "()".
 After removing outer parentheses of each part, this is "" + "" = "".

 Note:
 S.length <= 10000
 S[i] is "(" or ")"
 S is a valid parentheses string
 */

public class Solution {
    public String removeOuterParentheses1(String S) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (char c: S.toCharArray()) {
            if(c == '(' && count++ > 0) {
                sb.append(c);
            }
            if (c == ')' && count-- > 1){
                sb.append(c);
            }

        }

        return sb.toString();
    }

    public String removeOuterParentheses(String S) {
        Stack<Character> parentheses = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char c: S.toCharArray()) {
            if (c == '(') {
                if(!parentheses.isEmpty()) {
                    sb.append("(");
                }
                parentheses.push(c);
            }
            if (c == ')') {
                parentheses.pop();
                if(!parentheses.isEmpty()) {
                    sb.append(")");
                }
            }
        }

        return sb.toString();
    }
}
