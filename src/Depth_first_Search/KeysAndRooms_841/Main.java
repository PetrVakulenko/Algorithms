package Depth_first_Search.KeysAndRooms_841;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        List<Integer> r1 = new ArrayList<>();
        r1.add(1);
        r1.add(3);
        List<Integer> r2 = new ArrayList<>();
        r2.add(3);
        r2.add(0);
        r2.add(1);
        List<Integer> r3 = new ArrayList<>();
        r3.add(2);
        List<Integer> r4 = new ArrayList<>();
        r4.add(0);

        List<List<Integer>> input = new ArrayList<>();
        input.add(r1);
        input.add(r2);
        input.add(r3);
        input.add(r4);

        System.out.println(s.canVisitAllRooms(input));
    }
}
