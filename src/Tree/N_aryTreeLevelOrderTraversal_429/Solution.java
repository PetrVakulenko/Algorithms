package Tree.N_aryTreeLevelOrderTraversal_429;

import Utils.Node;

import java.util.ArrayList;
import java.util.List;

/**
 429. N-ary Tree Level Order Traversal
 https://leetcode.com/problems/n-ary-tree-level-order-traversal/description/

 Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 For example, given a 3-ary tree:

 Input:
       1
     / | \
    3  2  4
   / \
  5   6

 We should return its level order traversal:
 [
    [1],
    [3,2,4],
    [5,6]
 ]

 Note:
 The depth of the tree is at most 1000.
 The total number of nodes is at most 5000.
 */

public class Solution {
    List<List<Integer>> h = new ArrayList<>();

    List<Integer> tmp;

    public List<List<Integer>> levelOrder(Node root) {
        setOrderedList(root, 1);

        return h;
    }

    public void setOrderedList(Node root, int depth) {
        if (root == null) return;

        if (h.size() < depth) {
            h.add(new ArrayList<>());
        }

        tmp = h.get(depth-1);
        tmp.add(root.val);
        h.set(depth-1, tmp);

        for (Node temp : root.children) {
            setOrderedList(temp, depth + 1);
        }
    }
}
