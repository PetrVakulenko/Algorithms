package String.ShortestDistanceToACharacter_821;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        //String S = "loveleetcode";
        String S = "baab";
        //char C = 'e';
        char C = 'b';

        Utils.PrintResult.printArray(s.shortestToChar(S, C));
    }
}
