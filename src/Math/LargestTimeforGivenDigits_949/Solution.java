package Math.LargestTimeforGivenDigits_949;

import java.util.Arrays;

/**
 949. Largest Time for Given Digits

 Given an array of 4 digits, return the largest 24 hour time that can be made.
 The smallest 24 hour time is 00:00, and the largest is 23:59.  Starting from 00:00, a time is larger if more time has elapsed since midnight.
 Return the answer as a string of length 5.  If no valid time can be made, return an empty string.

 Example 1:
 Input: [1,2,3,4]
 Output: "23:41"

 Example 2:
 Input: [5,5,5,5]
 Output: ""

 Note:
 A.length == 4
 0 <= A[i] <= 9
 */

public class Solution {
    //Taken to tackle cases such as [0,0,0,0], [2,0,0,5] etc. Or A[] having 0 as one of the element
    char[] resChars = {'0', '0', ':', '0', '0'};

    public String largestTimeFromDigits(int[] A) {
        int maxMinutes = -1;
        String result = "";
        boolean[] visited = new boolean[4];

        for(int i = 0; i < 4; i++) {
            visited[i] = true; //Selected index for tens' place in hour

            for(int j = 0; j < 4; j++) {
                if(i == j)
                    continue;

                visited[j] = true; //Selected index for ones' place in hour
                int hours = A[i] * 10 + A[j]; //Hour value calculation

                //Now we find the minutes value from other 2 unvisited indices.
                int minutes = 0;
                int multiplier = 10;
                for(int k = 0; k < 4; k++) {
                    if(visited[k] == false) {
                        minutes += A[k] * multiplier;
                        multiplier /= 10;
                    }
                }
                if(isValidTime(hours, minutes) && timeToMinutes(hours, minutes) > maxMinutes) {
                    maxMinutes = timeToMinutes(hours, minutes);
                    storeTime(hours, minutes);
                    result = String.valueOf(resChars);
                }

                minutes = 0;
                multiplier = 10;
                for(int k = 3; k >= 0; k--) {
                    if(visited[k] == false) {
                        minutes += A[k] * multiplier;
                        multiplier /= 10;
                    }
                }
                if(isValidTime(hours, minutes) && timeToMinutes(hours, minutes) > maxMinutes) {
                    maxMinutes = timeToMinutes(hours, minutes);
                    storeTime(hours, minutes);
                    result = String.valueOf(resChars);
                }

                visited[j] = false; //Deselected the index for ones' place after usage
            }

            visited[i] = false; //Deselected the index for tens' place after usage
        }

        return result;
    }

    private boolean isValidTime(int hour, int minute) {
        if(hour >= 24 || minute >= 60) return false;

        return true;
    }

    private int timeToMinutes(int hour, int minute) {
        return (hour * 60) + minute;
    }

    private void storeTime(int hours, int minutes) {
        resChars[0] = (char)(hours / 10 + '0');
        resChars[1] = (char)(hours % 10 + '0');
        resChars[3] = (char)(minutes / 10 + '0');
        resChars[4] = (char)(minutes % 10 + '0');
    }
}
