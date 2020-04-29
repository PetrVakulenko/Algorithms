package HashTable.WordPattern_290;

import java.util.HashMap;

/**
 290. Word Pattern

 Given a pattern and a string str, find if str follows the same pattern.
 Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

 Example 1:
 Input: pattern = "abba", str = "dog cat cat dog"
 Output: true

 Example 2:
 Input:pattern = "abba", str = "dog cat cat fish"
 Output: false

 Example 3:
 Input: pattern = "aaaa", str = "dog cat cat dog"
 Output: false

 Example 4:
 Input: pattern = "abba", str = "dog dog dog dog"
 Output: false

 Notes:
 You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.
 */

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap();
        HashMap<String, Character> map1 = new HashMap();

        String[] splitted = str.split(" ");

        if (pattern.length() != splitted.length) return false;

        for (int i = 0; i < splitted.length; i++) {
            char ch = pattern.charAt(i);

            if (!map.containsKey(ch) && !map1.containsKey(splitted[i])) {
                map.put(ch, splitted[i]);
                map1.put(splitted[i], ch);
            } else {
                if (!map.containsKey(ch)) return false;
                if (!map1.containsKey(splitted[i])) return false;

                String tmp = map.get(ch);

                if (!splitted[i].equals(tmp)) return false;
                if (ch != map1.get(splitted[i])) return false;
            }
        }

        return true;
    }
}
