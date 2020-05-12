package String.MostCommonWord_819;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] banned = {"hit"};
        System.out.println(s.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", banned));
    }
}
