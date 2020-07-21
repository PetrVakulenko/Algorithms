package HashTable.IslandPerimeter_463;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[][] input = {
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}
        };

        System.out.println(s.islandPerimeter(input));
    }
}
