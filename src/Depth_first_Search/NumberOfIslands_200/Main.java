package Depth_first_Search.NumberOfIslands_200;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        
        char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};

        System.out.println(s.numIslands(grid));
    }
}
