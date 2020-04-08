package HashTable.GroupAnagrams_49;

import java.util.*;

/**
 49. Group Anagrams

 Given an array of strings, group anagrams together.

 Example:

 Input: ["eat", "tea", "tan", "ate", "nat", "bat"],

 Output:
 [
 ["ate","eat","tea"],
 ["nat","tan"],
 ["bat"]
 ]

 Note:
 All inputs will be in lowercase.
 The order of your output does not matter.
 */

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList();

        HashMap<String, List<String>> map = new HashMap();

        for (int i = 0; i < strs.length; i++) {
            char[] c1 = strs[i].toCharArray();
            Arrays.sort(c1);
            String currentKey = new String(c1);

            List<String> tmp = map.getOrDefault(currentKey, new ArrayList<String>());

            tmp.add(strs[i]);

            map.put(currentKey, tmp);
        }

        for (String key: map.keySet()) {
            result.add(map.get(key));
        }

        return result;
    }
}
