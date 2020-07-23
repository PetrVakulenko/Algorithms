package Design.SubrectangleQueries_1476;

public class Main {
    public static void main(String[] args) {
        int[][] input = {
                {1,2,1},
                {4,3,4},
                {3,2,1},
                {1,1,1}
        };

        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(input);
        subrectangleQueries.getValue(0, 2); // return 1
        subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);
        subrectangleQueries.getValue(0, 2); // return 5
        subrectangleQueries.getValue(3, 1); // return 5
        subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);
        subrectangleQueries.getValue(3, 1); // return 10
        subrectangleQueries.getValue(0, 2); // return 5
    }
}
