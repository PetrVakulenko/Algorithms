package Array.DataStructures.FirstUniqueNumber;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class FirstUnique {
    HashSet<Integer> unique = new LinkedHashSet<Integer>();
    HashSet<Integer> allElements = new LinkedHashSet<Integer>();

    public FirstUnique(int[] nums) {
        unique = new LinkedHashSet<Integer>();
        allElements = new LinkedHashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            this.add(nums[i]);
        }
    }

    public int showFirstUnique() {
        if (unique.size() == 0) return -1;

        return unique.iterator().next();
    }

    public void add(int value) {
        if (allElements.contains(value)) {
            return;
        } else if (unique.contains(value)) {
            unique.remove(new Integer(value));
            allElements.add(value);
            return;
        }

        unique.add(value);
    }
}
