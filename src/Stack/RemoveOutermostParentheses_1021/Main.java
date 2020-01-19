package Stack.RemoveOutermostParentheses_1021;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        String A = "(()())(())(()(()))";

        System.out.println(s.removeOuterParentheses(A));
    }
}
