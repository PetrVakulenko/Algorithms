package Queue.NumberOfRecentCalls_933;

import java.util.*;

/**
 933. Number of Recent Calls
 https://leetcode.com/problems/number-of-recent-calls/

 Write a class RecentCounter to count recent requests.
 It has only one method: ping(int t), where t represents some time in milliseconds.
 Return the number of pings that have been made from 3000 milliseconds ago until now.
 Any ping with time in [t - 3000, t] will count, including the current ping.
 It is guaranteed that every call to ping uses a strictly larger value of t than before.

 Example 1:
 Input: inputs = ["RecentCounter","ping","ping","ping","ping"], inputs = [[],[1],[100],[3001],[3002]]
 Output: [null,1,2,3,3]

 Note:
 Each test case will have at most 10000 calls to ping.
 Each test case will call ping with strictly increasing values of t.
 Each call to ping will have 1 <= t <= 10^9.
 */

public class RecentCounter {
    public static final int GAP = 3000;
    private int indexToStart;
    private List<Interval> intervals;

    class Interval{
        int start;
        int end;
        public Interval(int s, int e){
            this.start = s;
            this.end = e;
        }
    }

    public RecentCounter() {
        intervals = new ArrayList<>();
        indexToStart = 0;
    }

    public int ping(int t) {
        int newStart = t-GAP;
        int newEnd = t;
        intervals.add(new Interval(newStart, newEnd));

        for (int i = indexToStart ; i < intervals.size(); i++){
            if(newStart > intervals.get(i).end){
                continue;
            }else{
                indexToStart = i;
                break;
            }
        }
        return intervals.size() - indexToStart;
    }
}
