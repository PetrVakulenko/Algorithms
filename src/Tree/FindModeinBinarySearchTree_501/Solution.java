package Tree.FindModeinBinarySearchTree_501;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 501. Find Mode in Binary Search Tree

 Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.
 Assume a BST is defined as follows:
 The left subtree of a node contains only nodes with keys less than or equal to the node's key.
 The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
 Both the left and right subtrees must also be binary search trees.

 For example:
 Given BST [1,null,2,2],

 1
  \
  2
 /
2
 return [2].

 Note: If a tree has more than one mode, you can return them in any order.
 Follow up: Could you do that without using any extra space? (Assume that the implicit stack space incurred due to recursion does not count).
 */

public class Solution {
    HashMap<Integer, Integer> map = new HashMap();

    int max = 0;

    List<Integer> res = new ArrayList();

    public int[] findMode(TreeNode root) {
        dfs(root);

        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }

    private void dfs(TreeNode root) {
        if (root == null) return;

        dfs(root.left);
        dfs(root.right);

        int maxVal = map.getOrDefault(root.val, 0) + 1;

        if (maxVal == max) {
            res.add(root.val);
        } else if (maxVal > max) {
            res = new ArrayList();
            res.add(root.val);
            max = maxVal;
        }

        map.put(root.val, maxVal);
    }
}
