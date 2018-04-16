package Array.NumberOfLinesToWriteString_806;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        //int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        //String str = "bbbcccdddaaa";
        int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(Arrays.toString(s.numberOfLines(widths,str)));
    }
}
