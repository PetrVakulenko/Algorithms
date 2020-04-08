package HashTable.ShortestCompletingWord_748;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        String licencePlate = "1s3 PSt";
        String[] words = {"step", "steps", "stripe", "stepple"};

        System.out.println(s.shortestCompletingWord(licencePlate, words));
    }
}
