package String.ToLowerCase_709;

/**
 709. To Lower Case

 Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

 Example 1:
 Input: "Hello"
 Output: "hello"

 Example 2:
 Input: "here"
 Output: "here"

 Example 3:
 Input: "LOVELY"
 Output: "lovely"
 */

class Solution {
    public String toLowerCase(String str) {
        char[] arr = str.toCharArray();
        int tmp;
        String result = "";
        int l = arr.length;
        for(int i=0; i<l; i++){
            tmp = (int) arr[i];
            if (tmp >= 65 && tmp <= 90) {
                tmp += 32;
            }
            result += (char) tmp;
        }

        return result;
    }
}
