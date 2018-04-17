package String.UniqueMorseCodeWords_804;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 804. Unique Morse Code Words
 https://leetcode.com/problems/unique-morse-code-words/description/

 International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

 For convenience, the full table for the 26 letters of the English alphabet is given below:

 [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.

 Return the number of different transformations among all words we have.

 Example:
 Input: words = ["gin", "zen", "gig", "msg"]
 Output: 2
 Explanation:
 The transformation of each word is:
 "gin" -> "--...-."
 "zen" -> "--...-."
 "gig" -> "--...--."
 "msg" -> "--...--."

 There are 2 different transformations, "--...-." and "--...--.".
 */

public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String alphabet[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> diff = new HashSet<>();
        int askia = (int)'a';
        for(String w : words){
            StringBuilder str = new StringBuilder();
            char c[] = w.toCharArray();
            for(char ch : c){
                str.append(alphabet[(int)ch - askia]);
            }
            diff.add(str.toString());
        }
        return diff.size();
    }
}
