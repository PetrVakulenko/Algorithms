package HashTable.TopKFrequentElements_347;

import java.util.*;

/**
 347. Top K Frequent Elements

 Given a non-empty array of integers, return the k most frequent elements.

 Example 1:
 Input: nums = [1,1,1,2,2,3], k = 2
 Output: [1,2]

 Example 2:
 Input: nums = [1], k = 1
 Output: [1]

 Note:
 You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 It's guaranteed that the answer is unique, in other words the set of the top k frequent elements is unique.
 You can return the answer in any order.
 */

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap <>();
        for (int num : nums) {
            frequency.put (num, frequency.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((key1, key2) -> frequency.get (key2) - frequency.get (key1));
        queue.addAll(frequency.keySet ());

        int[] topKList = new int[k];
        for (int i = 0; i < k; i++) {
            topKList[i] = queue.poll();
        }

        return topKList;
    }
}
