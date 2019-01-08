package Tree.MaximumBinaryTree__654;

import Utils.TreeNode;

/**
 654. Maximum Binary Tree
 https://leetcode.com/problems/maximum-binary-tree/

 Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:

 The root is the maximum number in the array.
 The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
 The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
 Construct the maximum tree by the given array and output the root node of this tree.

 Example 1:
 Input: [3,2,1,6,0,5]
 Output: return the tree root node representing the following tree:

     6
    / \
   3  5
   \  /
   2 0
   \
   1
 Note:
 The size of the given array will be in the range [1,1000].
 */

public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return MaximumNode(nums, 0, nums.length - 1);
    }

    private TreeNode MaximumNode(int[] nums, int left, int right) {
        int max = nums[left], maxIndex = left;
        for (int i = left; i <= right; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        TreeNode node = new TreeNode(max);

        if (maxIndex > left) {
            node.left = MaximumNode(nums, left, maxIndex - 1);
        }
        if (maxIndex < right) {
            node.right = MaximumNode(nums, maxIndex + 1 , right);
        }

        return node;
    }
}
