package HashTable.MinimumIndexSumofTwoLists_599;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"KFC", "Shogun", "Burger King"};

        System.out.println(Arrays.toString(s.findRestaurant(list1, list2)));
    }
}
