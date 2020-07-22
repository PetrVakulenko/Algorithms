package Graph.CourseScheduleII_210;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] courses = {{1,0},{2,0},{3,1},{3,2}};

        System.out.println(Arrays.toString(s.findOrder(3, courses)));
    }
}
