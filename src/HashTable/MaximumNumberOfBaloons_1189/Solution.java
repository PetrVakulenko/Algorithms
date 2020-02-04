package HashTable.MaximumNumberOfBaloons_1189;

import java.util.HashMap;
import java.util.Map;

/**
 1189. Maximum Number of Balloons

 Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
 You can use each character in text at most once. Return the maximum number of instances that can be formed.

 Example 1:
 Input: text = "nlaebolko"
 Output: 1

 Example 2:
 Input: text = "loonbalxballpoon"
 Output: 2

 Example 3:
 Input: text = "leetcode"
 Output: 0

 Constraints:
 1 <= text.length <= 10^4
 text consists of lower case English letters only.
 */

class Solution {
    public int maxNumberOfBalloons1(String text) {
        Map<Character, Integer> tmp = new HashMap();
        tmp.put('b', 0);
        tmp.put('a', 0);
        tmp.put('l', 0);
        tmp.put('o', 0);
        tmp.put('n', 0);
        for (char ch: text.toCharArray()) {
            if (ch == 'b' || ch == 'a' || ch == 'l' || ch == 'o' || ch == 'n') {
                int tempVal = tmp.get(ch);
                tmp.put(ch, tempVal + 1);
            }
        }

        int result = tmp.get('b');
        result = Math.min(result, tmp.get('a'));
        result = Math.min(result, (int) tmp.get('l') / 2);
        result = Math.min(result, (int) tmp.get('o') / 2);
        result = Math.min(result, tmp.get('n'));

        return result;
    }

    public int maxNumberOfBalloons(String text) {
        int[] arr =  new int[26];
        char[] texts = text.toCharArray();
        int min = Integer.MAX_VALUE;
        char[] target = {'b', 'a', 'l', 'l', 'o', 'o', 'n'};
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < target.length; i++){
            map.put(target[i], map.getOrDefault(target[i], 0) + 1);
        }

        for(int i=0;i<texts.length;i++){
            arr[texts[i]-'a']++;
        }

        for(int i=0;i<arr.length;i++){
            char curr = (char) (i+'a');
            if(map.containsKey(curr)){
                min = Math.min(min, arr[i]/map.get(curr));
            }
        }

        return min;
    }
}