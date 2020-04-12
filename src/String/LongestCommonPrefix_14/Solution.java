package String.LongestCommonPrefix_14;

/**
 14. Longest Common Prefix

 Write a function to find the longest common prefix string amongst an array of strings.
 If there is no common prefix, return an empty string "".

 Example 1:
 Input: ["flower","flow","flight"]
 Output: "fl"

 Example 2:
 Input: ["dog","racecar","car"]
 Output: ""
 Explanation: There is no common prefix among the input strings.

 Note:
 All given inputs are in lowercase letters a-z.
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        String prefix = strs[0];

        for(int i = 1 ; i <strs.length;i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);

                if(prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    public String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            prefix = getCommonPrefix(prefix, strs[i]);

            if (prefix == "") return prefix;
        }

        return prefix;
    }

    private String getCommonPrefix(String currentPrefix, String word)
    {
        String prefix = "";

        int len = Math.min(currentPrefix.length(), word.length());

        int i = 0;

        while (i < len) {
            if (currentPrefix.charAt(i) == word.charAt(i)) {
                prefix += currentPrefix.charAt(i);
            } else {
                break;
            }

            i++;
        }

        return prefix;
    }
}