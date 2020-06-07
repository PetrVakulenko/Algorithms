package Tree.BalanceaBinarySearchTree_1382;

import java.util.*;
import Utils.TreeNode;

/**
 1382. Balance a Binary Search Tree

 Given a binary search tree, return a balanced binary search tree with the same node values.
 A binary search tree is balanced if and only if the depth of the two subtrees of every node never differ by more than 1.
 If there is more than one answer, return any of them.

 Example 1:
 Input: root = [1,null,2,null,3,null,4,null,null]
 Output: [2,1,3,null,null,null,4]
 Explanation: This is not the only correct answer, [3,1,4,null,2,null,null] is also correct.

 Constraints:
 The number of nodes in the tree is between 1 and 10^4.
 The tree nodes will have distinct values between 1 and 10^5.
 */

public class Solution {
    ArrayList<Integer> nodes = new ArrayList();

    public TreeNode balanceBST(TreeNode root) {
        addAllNodes(root);

        TreeNode result = make(nodes, 0, nodes.size() - 1);

        return result;
    }

    public static TreeNode make(ArrayList<Integer> arr,int s,int e)
    {
        if(s>e) return null;
        int mid=(s+e)/2;
        TreeNode root=new TreeNode(arr.get(mid));
        root.left=make(arr,s,mid-1);
        root.right=make(arr,mid+1,e);

        return root;
    }

    private void addAllNodes(TreeNode root) {
        if (root == null) return;

        addAllNodes(root.left);
        nodes.add(root.val);
        addAllNodes(root.right);
    }
}
