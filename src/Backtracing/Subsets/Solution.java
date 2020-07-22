package Backtracing.Subsets;

import java.util.*;

/**
 78. Subsets

 Given a set of distinct integers, nums, return all possible subsets (the power set).
 Note: The solution set must not contain duplicate subsets.

 Example:
 Input: nums = [1,2,3]
 Output:
 [
 [3],
 [1],
 [2],
 [1,2,3],
 [1,3],
 [2,3],
 [1,2],
 []
 ]
 */

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<> ();
        result.add (new LinkedList<> ());

        for (int num : nums) {
            List<List<Integer>> helper = new ArrayList <> ();
            for (List<Integer> current : result) {
                List<Integer> temp = new ArrayList<> (current);
                temp.add (num);
                helper.add (temp);
            }

            for (List<Integer> current : helper) {
                result.add (current);
            }
        }

        return result;
    }
}