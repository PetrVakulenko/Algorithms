package Stack.RemoveAllAdjacentDuplicatesInString_1047;

import java.util.Stack;

/**
 1047. Remove All Adjacent Duplicates In String

 Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.
 We repeatedly make duplicate removals on S until we no longer can.
 Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.

 Example 1:
 Input: "abbaca"
 Output: "ca"
 Explanation:
 For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.
 The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".

 Note:
 1 <= S.length <= 20000
 S consists only of English lowercase letters.
 */

class Solution {
    public String removeDuplicates1(String S) {
        String result = "";

        Stack<Character> stack = new Stack();

        char[] ch = S.toCharArray();

        for (int i = 0; i < S.length(); i++) {
            if (!stack.isEmpty()) {
                char tmp = stack.pop();
                if (tmp != ch[i]) {
                    stack.push(tmp);
                    stack.push(ch[i]);
                }
            } else {
                stack.add(ch[i]);
            }
        }

        while (!stack.isEmpty()) {
            result = stack.pop() + result;
        }

        return result;
    }

    public String removeDuplicates(String S) {
        char[] ch = S.toCharArray();

        int i=0;

        for(int index=0; index < ch.length; index++,i++) {
            ch[i] = ch[index];
            if(i > 0 && ch[i] == ch[i-1]) i-=2;
        }

        return new String(ch, 0, i);
    }
}
