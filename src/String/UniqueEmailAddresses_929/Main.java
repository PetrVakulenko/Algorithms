package String.UniqueEmailAddresses_929;

public class Main {
    public static void main(String[] args) {
        String str[] = {
            "test.email+alex@leetcode.com",
            "test.e.mail+bob.cathy@leetcode.com",
            "testemail+david@lee.tcode.com"
        };
        Solution s = new Solution();
        int result = s.numUniqueEmails(str);
        System.out.println(result);
    }
}
