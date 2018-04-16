package String.KeyboardRow_500;

import java.util.ArrayList;
import java.util.List;

/**
 500. Keyboard Row
 https://leetcode.com/problems/keyboard-row/description/

 Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.


 American keyboard
  _____________
 | qwertyuiop |
 |  asdfghjkl |
 |   zxcvbnm  |
 |____________|

 Example 1:∟
 Input: ["Hello", "Alaska", "Dad", "Peace"]
 Output: ["Alaska", "Dad"]
 Note:
 You may use one character in the keyboard more than once.
 You may assume the input string will only contain letters of alphabet.
 */

public class Solution {
    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop","asdfghjkl","zxcvbnm"};
        List<String> results = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            String str = words[i].toLowerCase();
            int[] arr = {0,0,0};
            for(int j = 0; j < str.length(); j++){
                Boolean mute = false;
                for(int k = 0; k < rows.length; k++){
                    if (rows[k].indexOf(str.charAt(j)) != -1){
                        arr[k]++;
                        if (arr[k] != j+1) {
                            mute = true;
                            break;
                        }
                        if (j == str.length()-1){
                            results.add(words[i]);
                        }
                    }
                }
                if (mute) break;
            }
        }
        return results.toArray(new String[results.size()]);
    }
}
