package HashTable.UncommonWordsFromTwoSentences_884;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String A = "this apple is sweet", B = "this apple is sour";
        System.out.println(Arrays.toString(s.uncommonFromSentences(A, B)));
    }
}
