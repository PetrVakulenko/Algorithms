package Greedy.WalkingRobotSimulation_874;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] commands = {4, -1, 4, -2, 4};
        int[][] obstacles = new int[0][0];
        System.out.println(s.robotSim(commands, obstacles));
    }
}
