package String.CompareStringsByFrequencyOfTheSmallestCharacter_1170;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        String[] queries = {"bbb", "ccc"};
        String[] words = {"a", "aa", "aaa", "aaaa"};

        System.out.println(Arrays.toString(s.numSmallerByFrequency(queries, words)));
    }
}
