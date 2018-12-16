package Tree.AverageOfLevelsInBinaryTree_637;

import Utils.TreeNode;

import java.util.*;

/**
 637. Average of Levels in Binary Tree
 https://leetcode.com/problems/average-of-levels-in-binary-tree/description/

 Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
 Example 1:
 Input:
   3
  / \
 9  20
   /  \
 15   7
 Output: [3, 14.5, 11]
 Explanation:
 The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].

 Note:
 The range of node's value is in the range of 32-bit signed integer.
 */

public class Solution {
    Map<Integer, List<Integer>> h = new HashMap<>();

    public List<Double> averageOfLevels(TreeNode root) {
        calculateListsByLevel(root, 1);

        List<Double> result = new ArrayList<>();

        long sum;

        for(Integer tmp: h.keySet()) {
            sum = 0;
            for (Integer inttmp: h.get(tmp)) {
                sum += inttmp;
            }

            result.add((double) sum/(h.get(tmp).size()));
        }

        return result;
    }

    public void calculateListsByLevel(TreeNode root, int depth) {
        if (root == null) return;

        List<Integer> tmp = h.get(depth) == null ? new ArrayList<>() : h.get(depth);

        tmp.add(root.val);

        h.put(depth, tmp);

        calculateListsByLevel(root.left, depth + 1);
        calculateListsByLevel(root.right, depth + 1);
    }
}
