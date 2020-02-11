package Tree.SumOfRootToLeafBinaryNumbers_1022;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 1022. Sum of Root To Leaf Binary Numbers

 Given a binary tree, each node has value 0 or 1.
 Each root-to-leaf path represents a binary number starting with the most significant bit.
 For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.
 For all leaves in the tree, consider the numbers represented by the path from the root to that leaf.
 Return the sum of these numbers.

 Example 1:
 Example:
        1
      /  \
     0    1
    / \  / \
   0  1 0  1
 Input: [1,0,1,0,1,0,1]
 Output: 22
 Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22

 Note:
 The number of nodes in the tree is between 1 and 1000.
 node.val is 0 or 1.
 The answer will not exceed 2^31 - 1.

 There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */

class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return sumRootToLeaf(root, 0);
    }

    private int sumRootToLeaf(TreeNode root, int val) {
        if (root == null) return 0;

        int nextVal = root.val + 2 * val;
        if (root.left == null && root.right == null) return nextVal;
        return (sumRootToLeaf(root.left, nextVal) + sumRootToLeaf(root.right, nextVal));
    }
}

class Solution1 {
    private List<List<Integer>> leafs = new ArrayList();

    public int sumRootToLeaf(TreeNode root) {
        List<Integer> tmp = new ArrayList();

        calculateListOfLeafs(root, tmp);

        int result = 0;

        for (int i = 0; i < leafs.size(); i++) {
            List<Integer> tempLeaf = leafs.get(i);

            int tempLeafSize = tempLeaf.size();

            for (int j = 0; j < tempLeafSize; j++) {
                result += tempLeaf.get(j) << (tempLeafSize - j - 1);
            }
        }

        return result;
    }

    private void calculateListOfLeafs(TreeNode root, List<Integer> tmp)
    {
        List<Integer> clonedList = new ArrayList(tmp);
        clonedList.add(root.val);

        if (root.left == null && root.right == null) {
            leafs.add(clonedList);

            return;
        }

        if (root.left != null) {
            calculateListOfLeafs(root.left, clonedList);
        }

        if (root.right != null) {
            calculateListOfLeafs(root.right, clonedList);
        }
    }
}
