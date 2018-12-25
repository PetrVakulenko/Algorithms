package HashTable.VerifyingAnAlienDictionary_953;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 953. Verifying an Alien Dictionary
 https://leetcode.com/problems/verifying-an-alien-dictionary/

 In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order.
 The order of the alphabet is some permutation of lowercase letters.

 Given a sequence of words written in the alien language, and the order of the alphabet,
    return true if and only if the given words are sorted lexicographicaly in this alien language.

 Example 1:
 Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
 Output: true
 Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.

 Example 2:
 Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
 Output: false
 Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.

 Example 3:
 Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
 Output: false
 Explanation: The first three characters "app" match, and the second string is shorter (in size.)
 According to lexicographical rules "apple" > "app", because 'l' > '∅',
    where '∅' is defined as the blank character which is less than any other character (More info).

 Note:
 1 <= words.length <= 100
 1 <= words[i].length <= 20
 order.length == 26
 All characters in words[i] and order are english lowercase letters.
 */

public class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        if(order == null){
            return false;
        }
        int i, index;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(i = 0; i < order.length(); i ++){
            hm.put(order.charAt(i), i);
        }
        for(i = 0; i < words.length - 1; i ++){
            String cur = words[i];
            String next = words[i + 1];

            for(index = 0; index < cur.length() && index < next.length(); index ++){
                if(hm.get(cur.charAt(index)) > hm.get(next.charAt(index))){
                    return false;
                }else if(hm.get(cur.charAt(index)) == hm.get(next.charAt(index))){
                    continue;
                }else{
                    break;
                }
            }
            if(index < cur.length() && index == next.length()){
                return false;
            }
        }
        return true;
    }
}
