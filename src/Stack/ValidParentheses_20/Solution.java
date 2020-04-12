package Stack.ValidParentheses_20;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 20. Valid Parentheses

 Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 An input string is valid if:
 Open brackets must be closed by the same type of brackets.
 Open brackets must be closed in the correct order.
 Note that an empty string is also considered valid.

 Example 1:
 Input: "()"
 Output: true

 Example 2:
 Input: "()[]{}"
 Output: true

 Example 3:
 Input: "(]"
 Output: false

 Example 4:
 Input: "([)]"
 Output: false

 Example 5:
 Input: "{[]}"
 Output: true
 */

public class Solution {
    public boolean isValid(String s) {
        int a = 0;
        int b = 0;
        int c = 0;

        List<Character> opened = new ArrayList();

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                opened.add('(');
            }
            if (chars[i] == ')') {
                if (opened.size() == 0) return false;
                if (opened.get(opened.size() - 1) == '(') {
                    opened.remove(opened.size() - 1);
                }  else {
                    return false;
                }
            }
            if (chars[i] == '{') {
                opened.add('{');
            }
            if (chars[i] == '}') {
                if (opened.size() == 0) return false;
                if (opened.get(opened.size() - 1) == '{') {
                    opened.remove(opened.size() - 1);
                }  else {
                    return false;
                }
            }
            if (chars[i] == '[') {
                opened.add('[');
            }
            if (chars[i] == ']') {
                if (opened.size() == 0) return false;
                if (opened.get(opened.size() - 1) == '[') {
                    opened.remove(opened.size() - 1);
                }  else {
                    return false;
                }
            }
        }

        return opened.size() == 0;
    }
}
