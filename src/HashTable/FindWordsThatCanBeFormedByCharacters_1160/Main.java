package HashTable.FindWordsThatCanBeFormedByCharacters_1160;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        String[] words = {"cat","bt","hat","tree"};

        String chars = "atach";

        System.out.println(s.countCharacters(words, chars));
    }
}
