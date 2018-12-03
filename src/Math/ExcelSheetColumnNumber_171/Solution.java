package Math.ExcelSheetColumnNumber_171;

/**
 171. Excel Sheet Column Number
 https://leetcode.com/problems/excel-sheet-column-number/description/

 Given a column title as appear in an Excel sheet, return its corresponding column number.

 For example:
 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28

 Example 1:
 Input: "A"
 Output: 1

 Example 2:
 Input: "AB"
 Output: 28

 Example 3:
 Input: "D"
 Output: 701
 */

public class Solution {
    public int titleToNumber(String s) {
        if (s.equals("")) {
            return 0;
        }

        int length = s.length() - 1, res = 0;

        for(char c: s.toCharArray()) {
            res += (int) (Math.pow(26, length--) * ((int) c - 64));
        }

        return res;
    }
}
