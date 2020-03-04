package HashTable.OccurrencesAfterBigram_1078;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(
            Arrays.toString(
                s.findOcurrences("alice is a good girl she is a good student", "a", "good")
            )
        );
    }
}
