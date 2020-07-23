package Tree.MaximumWidthofBinaryTree_662;

import Utils.TreeNode;
import java.util.*;

/**
 662. Maximum Width of Binary Tree

 Given a binary tree, write a function to get the maximum width of the given tree. The maximum width of a tree is the maximum width among all levels.
 The width of one level is defined as the length between the end-nodes (the leftmost and right most non-null nodes in the level, where the null nodes between the end-nodes are also counted into the length calculation.
 It is guaranteed that the answer will in the range of 32-bit signed integer.

 Example 1:
 Input:

      1
    /   \
   3     2
  / \     \
 5   3     9

 Output: 4
 Explanation: The maximum width existing in the third level with the length 4 (5,3,null,9).
 Example 2:

 Input:

     1
    /
   3
  / \
 5   3

 Output: 2
 Explanation: The maximum width existing in the third level with the length 2 (5,3).
 Example 3:

 Input:

     1
    / \
   3   2
  /
 5

 Output: 2
 Explanation: The maximum width existing in the second level with the length 2 (3,2).
 Example 4:

 Input:

       1
      / \
     3   2
    /     \
   5       9
  /         \
 6           7
 Output: 8
 Explanation:The maximum width existing in the fourth level with the length 8 (6,null,null,null,null,null,null,7).


 Constraints:
 The given binary tree will have between 1 and 3000 nodes.
 */

public class Solution {
    int maxWidth = 0;
    List<Integer> minIndex = new ArrayList<Integer>();
    public int widthOfBinaryTree(TreeNode root) {
        dfs(root, 0, 0);
        return maxWidth;
    }

    private void dfs(TreeNode root, int x, int y) {
        if (root == null) return;
        if (minIndex.size() == y) minIndex.add(x);

        maxWidth = Math.max(maxWidth, x - minIndex.get(y) + 1);
        dfs(root.left, 2 * x, y + 1);
        dfs(root.right, 2 * x + 1, y + 1);
    }
}
