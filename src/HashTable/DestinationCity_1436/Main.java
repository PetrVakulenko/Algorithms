package HashTable.DestinationCity_1436;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        List<String> path1 = new ArrayList<>();
        path1.add("London");
        path1.add("New York");

        List<String> path2 = new ArrayList<>();
        path1.add("New York");
        path1.add("Lima");

        List<String> path3 = new ArrayList<>();
        path1.add("Lima");
        path1.add("Sao Paulo");

        List<List<String>> input = new ArrayList<>();
        input.add(path1);
        input.add(path2);
        input.add(path3);

        System.out.println(s.destCity(input));
    }
}
