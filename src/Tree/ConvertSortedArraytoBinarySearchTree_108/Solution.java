package Tree.ConvertSortedArraytoBinarySearchTree_108;

import Utils.TreeNode;

/**
 108. Convert Sorted Array to Binary Search Tree

 Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

 Example:
 Given the sorted array: [-10,-3,0,5,9],
 One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
      0
     / \
   -3  9
   /  /
 -10 5
 */

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;

        if (len == 0) return null;
        if (len == 1) return new TreeNode(nums[0]);

        int middle = len/2;

        TreeNode root = new TreeNode(nums[middle]);

        int[] leftNums = new int[middle];
        for (int i = 0; i < middle; i++) {
            leftNums[i] = nums[i];
        }
        root.left = sortedArrayToBST(leftNums);

        int[] rightNums = new int[len - middle - 1];
        for (int i = middle+1; i < len; i++) {
            rightNums[i - middle - 1] =nums[i];
        }
        root.right = sortedArrayToBST(rightNums);

        return root;
    }
}
