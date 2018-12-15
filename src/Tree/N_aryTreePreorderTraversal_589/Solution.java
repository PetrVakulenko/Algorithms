package Tree.N_aryTreePreorderTraversal_589;

import Utils.Node;

import java.util.ArrayList;
import java.util.List;

/**
 589. N-ary Tree Preorder Traversal
 https://leetcode.com/problems/n-ary-tree-preorder-traversal/description/

 Given an n-ary tree, return the preorder traversal of its nodes' values.

 For example, given a 3-ary tree:

 Input:
       1
     / | \
    3  2  4
   / \
  5   6

 Return its preorder traversal as: [1,3,5,6,2,4].

 Note:
 Recursive solution is trivial, could you do it iteratively?
 */

public class Solution {
    List<Integer> result = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if(root == null) return result;
        result.add(root.val);
        if(root.children != null){
            for(Node child: root.children) preorder(child);
        }
        return result;
    }

    public List<Integer> preorder1(Node root) {
        List<Integer> res = new ArrayList();
        if (root == null) return res;

        res.add(root.val);

        for (Node tmp : root.children) {
            res.addAll(preorder1(tmp));
        }

        return res;
    }
}
