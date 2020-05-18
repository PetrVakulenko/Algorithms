package Array.NumberofStudentsDoingHomeworkataGivenTime_1450;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] startTime = {1,2,3};
        int[] endTime = {3,2,7};
        int queryTime = 4;

        System.out.println(s.busyStudent(startTime, endTime, queryTime));
    }
}
