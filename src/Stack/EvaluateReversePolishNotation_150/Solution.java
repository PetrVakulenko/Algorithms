package Stack.EvaluateReversePolishNotation_150;

import java.util.Stack;

/**
 150. Evaluate Reverse Polish Notation

 Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 Valid operators are +, -, *, /. Each operand may be an integer or another expression.

 Note:
 Division between two integers should truncate toward zero.
 The given RPN expression is always valid. That means the expression would always evaluate to a result
   and there won't be any divide by zero operation.

 Example 1:
 Input: ["2", "1", "+", "3", "*"]
 Output: 9
 Explanation: ((2 + 1) * 3) = 9

 Example 2:
 Input: ["4", "13", "5", "/", "+"]
 Output: 6
 Explanation: (4 + (13 / 5)) = 6

 Example 3:
 Input: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
 Output: 22
 Explanation:
 ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 = ((10 * (6 / (12 * -11))) + 17) + 5
 = ((10 * (6 / -132)) + 17) + 5
 = ((10 * 0) + 17) + 5
 = (0 + 17) + 5
 = 17 + 5
 = 22
 */

class Solution {
    public int evalRPN(String[] tokens) {
        int len = tokens.length;

        if (len == 0) return 0;

        if (len == 1) return Integer.parseInt(tokens[0]);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < len - 1; i++) {
            char ch = tokens[i].charAt(0);

            if (tokens[i].length() == 1 && (ch == '*' || ch == '/' || ch == '-' || ch == '+')) {
                stack.push(checkStackNumber(stack, ch));
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }

        return checkStackNumber(stack, tokens[len - 1].charAt(0));
    }

    private int checkStackNumber(Stack<Integer> stack, char token)
    {
        int num1 = stack.pop();
        int num2 = stack.pop();

        if (token == '+') {
            return num2 + num1;
        }

        if (token == '*') {
            return num2 * num1;
        }
        if (token == '/') {
            return num2 / num1;
        }

        if (token == '-') {
            return num2 - num1;
        }

        return 0;
    }
}
