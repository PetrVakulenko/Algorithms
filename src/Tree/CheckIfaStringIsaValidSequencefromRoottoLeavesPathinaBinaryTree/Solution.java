package Tree.CheckIfaStringIsaValidSequencefromRoottoLeavesPathinaBinaryTree;

import Utils.TreeNode;

/**
 Check If a String Is a Valid Sequence from Root to Leaves Path in a Binary Tree
 Given a binary tree where each path going from the root to any leaf form a valid sequence,
   check if a given string is a valid sequence in such binary tree.
 We get the given string from the concatenation of an array of integers arr and the concatenation of all values
   of the nodes along a path results in a sequence in the given binary tree.

 Example 1:
 Input: root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,1,0,1]
 Output: true
 Explanation:
 The path 0 -> 1 -> 0 -> 1 is a valid sequence (green color in the figure).
 Other valid sequences are:
 0 -> 1 -> 1 -> 0
 0 -> 0 -> 0

 Example 2:
 Input: root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,0,1]
 Output: false
 Explanation: The path 0 -> 0 -> 1 does not exist, therefore it is not even a sequence.

 Example 3:
 Input: root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,1,1]
 Output: false
 Explanation: The path 0 -> 1 -> 1 is a sequence, but it is not a valid sequence.

 Constraints:
 1 <= arr.length <= 5000
 0 <= arr[i] <= 9
 Each node's value is between [0 - 9].
 */

public class Solution {
    private boolean isValid = false;

    public boolean isValidSequence(TreeNode root, int[] arr) {
        dfs(root, arr, 0);

        return isValid;
    }

    public void dfs(TreeNode root, int[] arr, int position) {
        if (root == null) return;
        if (position >= arr.length) return;
        if (root.val != arr[position]) return;

        if (root.val == arr[position] &&
                root.left == null &&
                root.right == null &&
                position == arr.length - 1
        ) {
            isValid = true;
            return;
        }

        dfs(root.left, arr, position + 1);
        dfs(root.right, arr, position + 1);
    }
}
