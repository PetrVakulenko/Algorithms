package Stack.CrawlerLogFolder_1598;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        String[] logs = {"d1/","d2/","../","d21/","./"};

        System.out.println(s.minOperations(logs));
    }
}
