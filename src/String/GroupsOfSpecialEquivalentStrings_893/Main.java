package String.GroupsOfSpecialEquivalentStrings_893;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        String[] A = {"abcd","cdab","adcb","cbad"};

        int result = s.numSpecialEquivGroups(A);
        System.out.println(result);
    }
}
