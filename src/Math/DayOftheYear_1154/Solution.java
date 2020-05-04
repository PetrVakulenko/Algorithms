package Math.DayOftheYear_1154;

/**
 1154. Day of the Year

 Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.

 Example 1:
 Input: date = "2019-01-09"
 Output: 9
 Explanation: Given date is the 9th day of the year in 2019.

 Example 2:
 Input: date = "2019-02-10"
 Output: 41

 Example 3:
 Input: date = "2003-03-01"
 Output: 60

 Example 4:
 Input: date = "2004-03-01"
 Output: 61

 Constraints:
 date.length == 10
 date[4] == date[7] == '-', and all other date[i]'s are digits
 date represents a calendar date between Jan 1st, 1900 and Dec 31, 2019.
 */

public class Solution {
    public int dayOfYear(String date) {
        int[] mdays = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

        String[] parts = date.split("-");

        int year = Integer.valueOf(parts[0]);
        int month = Integer.valueOf(parts[1]);
        int day = Integer.valueOf(parts[2]);

        boolean leapYear = isLeapYear(year);

        int result = mdays[month - 1] + day;

        if (month > 2 && leapYear) result++;

        return result;
    }

    private boolean isLeapYear(int year)
    {
        if (year % 4 != 0) return false;
        if (year % 100 == 0 && year % 400 != 0) return false;

        return true;
    }
}
