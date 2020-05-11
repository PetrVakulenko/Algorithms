package HashTable.LongestWordinDictionary_720;

import java.util.ArrayList;

/**
 720. Longest Word in Dictionary

 Given a list of strings words representing an English Dictionary, find the longest word in words that can be built
   one character at a time by other words in words. If there is more than one possible answer, return the longest word
   with the smallest lexicographical order.
 If there is no answer, return the empty string.

 Example 1:
 Input:
 words = ["w","wo","wor","worl", "world"]
 Output: "world"

 Explanation:
 The word "world" can be built one character at a time by "w", "wo", "wor", and "worl".

 Example 2:
 Input:
 words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
 Output: "apple"

 Explanation:
 Both "apply" and "apple" can be built from other words in the dictionary. However, "apple" is lexicographically smaller than "apply".

 Note:
 All the strings in the input will only contain lowercase letters.
 The length of words will be in the range [1, 1000].
 The length of words[i] will be in the range [1, 30].
 */

class Solution {
    public String longestWord(String[] words) {
        ArrayList<String> a=new ArrayList<String>();
        for(int i=0;i<words.length;i++) {
            a.add(words[i]);
        }
        String x="";
        for(int i=a.size()-1;i>=0;i--) {
            int j=a.get(i).length();
            for(;j>0;j--) {
                if(!a.contains(a.get(i).substring(0,j)))
                    break;
            }
            if(j==0) {
                if(x.length()<a.get(i).length())
                    x=a.get(i);
                else if(a.get(i).length()==x.length()&&a.get(i).compareTo(x)<0)
                    x=a.get(i);
            }
        }

        return x;
    }
}