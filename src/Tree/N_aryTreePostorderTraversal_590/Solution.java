package Tree.N_aryTreePostorderTraversal_590;

import Utils.Node;

import java.util.ArrayList;
import java.util.List;

/**
 590. N-ary Tree Postorder Traversal
 https://leetcode.com/problems/n-ary-tree-postorder-traversal/description/

 Given an n-ary tree, return the postorder traversal of its nodes' values.

 For example, given a 3-ary tree:

 Input:
       1
     / | \
    3  2  4
   / \
  5   6

 Return its postorder traversal as: [5,6,3,2,4,1].

 Note:
 Recursive solution is trivial, could you do it iteratively?
 */

public class Solution {
    List<Integer> result = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if(root == null) return result;
        if(root.children != null){
            for(Node child: root.children) postorder(child);
        }
        result.add(root.val);
        return result;
    }

    public List<Integer> postorder1(Node root) {
        List<Integer> res = new ArrayList();
        if (root == null) return res;

        for (Node tmp : root.children) {
            res.addAll(postorder1(tmp));
        }

        res.add(root.val);

        return res;
    }
}
