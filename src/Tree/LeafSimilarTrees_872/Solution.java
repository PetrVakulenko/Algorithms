package Tree.LeafSimilarTrees_872;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 100. Same Tree
 https://leetcode.com/problems/same-tree/description/

 Consider all the leaves of a binary tree.  From left to right order,
    the values of those leaves form a leaf value sequence.

 Example 1:
 Input:     1         1
           / \       / \
          6   7     6   7

 For example, in the given tree above, the leaf value sequence is (6, 7).

 Two binary trees are considered leaf-similar if their leaf value sequence is the same.
 Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.

 Note:
 Both of the given trees will have between 1 and 100 nodes.
 */

public class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafElements1 = getLeafElements(root1);
        List<Integer> leafElements2 = getLeafElements(root2);

        if (leafElements1.size() != leafElements2.size()) return false;

        for(int i = 0; i < leafElements1.size(); i++) {
            if (leafElements1.get(i) != leafElements2.get(i)) {
                return false;
            }
        }

        return true;
    }

    public List<Integer> getLeafElements(TreeNode tree) {
        List<Integer> l = new ArrayList<>();

        if (tree == null) return l;

        if (tree.left == null && tree.right == null) {
            l.add(tree.val);
        }

        l.addAll(getLeafElements(tree.left));
        l.addAll(getLeafElements(tree.right));

        return l;
    }
}
