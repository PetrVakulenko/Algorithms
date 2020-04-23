package HashTable.FirstUniqueCharacterinaString_387;

import java.util.HashSet;
import java.util.Set;

/**
 387. First Unique Character in a String

 Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

 Examples:
 s = "leetcode"
 return 0.

 s = "loveleetcode",
 return 2.

 Note: You may assume the string contain only lowercase letters.
 */

class Solution {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();

        Set<Character> visited = new HashSet();

        for (int i = 0; i < chars.length; i++) {
            if (visited.contains(chars[i])) continue;

            boolean found = false;

            for (int j = i+1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) return i;

            visited.add(chars[i]);
        }

        return -1;
    }
}