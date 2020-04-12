package Tree.TwoSum4InputIsABST_653;

import Utils.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 653. Two Sum IV - Input is a BST

 Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.

 Example 1:
 Input:
     5
    / \
   3   6
  / \   \
 2   4   7

 Target = 9
 Output: True

 Example 2:
 Input:
     5
    / \
   3   6
  / \   \
 2   4   7

 Target = 28
 Output: False
 */

public class Solution {
    Set<Integer> set = new HashSet();

    boolean result = false;

    public boolean findTarget(TreeNode root, int k) {
        addTarget(root, k);

        return result;
    }

    private void addTarget(TreeNode root, int k) {
        if (root == null || result == true) return;

        if (set.contains(k - root.val)) {
            result = true;
            return;
        }

        set.add(root.val);

        addTarget(root.left, k);
        addTarget(root.right, k);
    }
}
