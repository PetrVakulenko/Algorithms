package Tree.BinaryTreePaths_257;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 257. Binary Tree Paths

 Given a binary tree, return all root-to-leaf paths.

 Note: A leaf is a node with no children.

 Example:
 Input:

   1
  / \
 2  3
    \
    5

 Output: ["1->2->5", "1->3"]
 Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 */

public class Solution {
    List<String> results = new ArrayList();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return results;

        StringBuilder sb = new StringBuilder();

        addLists(root, sb);

        return results;
    }

    private void addLists(TreeNode root, StringBuilder str)
    {
        if (root == null) {
            return;
        }

        str.append(root.val);

        if (root.left == null && root.right == null) {
            results.add(str.toString());
            return;
        }

        str.append("->");

        int len = str.length();

        addLists(root.left, str);
        str.setLength(len);
        addLists(root.right, str);
    }
}
