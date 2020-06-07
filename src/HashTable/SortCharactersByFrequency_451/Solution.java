package HashTable.SortCharactersByFrequency_451;

import java.util.*;

/**
 451. Sort Characters By Frequency

 Given a string, sort it in decreasing order based on the frequency of characters.

 Example 1:
 Input:
 "tree"
 Output:
 "eert"
 Explanation:
 'e' appears twice while 'r' and 't' both appear once.
 So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

 Example 2:
 Input:
 "cccaaa"
 Output:
 "cccaaa"
 Explanation:
 Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
 Note that "cacaca" is incorrect, as the same characters must be together.

 Example 3:
 Input:
 "Aabb"
 Output:
 "bbAa"
 Explanation:
 "bbaA" is also a valid answer, but "Aabb" is incorrect.
 Note that 'A' and 'a' are treated as two different characters.
 */

public class Solution {
    public String frequencySort(String s) {
        char[] chars = s.toCharArray();

        Arrays.sort(chars);

        TreeMap<Integer, List<Character>> map = new TreeMap();

        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i-1]) {
                List<Character> tmp = map.getOrDefault(count, new ArrayList());
                tmp.add(chars[i-1]);

                map.put(count, tmp);

                count = 1;
            } else {
                count++;
            }

            if (i == chars.length - 1) {
                List<Character> tmp = map.getOrDefault(count, new ArrayList());
                tmp.add(chars[i]);
                map.put(count, tmp);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int co: map.keySet()) {
            List<Character> tmp = map.get(co);

            for (int j = 0; j < tmp.size(); j++) {
                char c = tmp.get(j);

                for (int i = 0; i < co; i++) {
                    sb.append(c);
                }
            }
        }

        return sb.reverse().toString();
    }
}
