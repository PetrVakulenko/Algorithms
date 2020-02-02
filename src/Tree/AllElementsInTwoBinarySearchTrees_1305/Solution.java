package Tree.AllElementsInTwoBinarySearchTrees_1305;

import Utils.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 1305. All Elements in Two Binary Search Trees

 Given two binary search trees root1 and root2.
 Return a list containing all the integers from both trees sorted in ascending order.

 Example 1:
 Input: root1 = [2,1,4], root2 = [1,0,3]
 Output: [0,1,1,2,3,4]

 Example 2:
 Input: root1 = [0,-10,10], root2 = [5,1,7,0,2]
 Output: [-10,0,0,1,2,5,7,10]

 Example 3:
 Input: root1 = [], root2 = [5,1,7,0,2]
 Output: [0,1,2,5,7]

 Example 4:
 Input: root1 = [0,-10,10], root2 = []
 Output: [-10,0,10]

 Example 5:
 Input: root1 = [1,null,8], root2 = [8,1]
 Output: [1,1,8,8]

 Constraints:
 Each tree has at most 5000 nodes.
 Each node's value is between [-10^5, 10^5].
 */

class Solution {
    public void checkTreeNodes(TreeNode root, Stack st)
    {
        if (root == null) return;

        checkTreeNodes(root.left, st);
        st.add(root.val);
        checkTreeNodes(root.right, st);
    }



    public List<Integer> getAllElements(TreeNode root1, TreeNode root2)
    {
        List<Integer> resultList = new ArrayList();

        Stack<Integer> st1 = new Stack();
        Stack<Integer> st2 = new Stack();

        checkTreeNodes(root1, st1);
        checkTreeNodes(root2, st2);

        int index1 = 0;
        int index2 = 0;
        int maxIndex1 = st1.size();
        int maxIndex2 = st2.size();

        while(maxIndex1 > index1 || maxIndex2 > index2) {
            if (index1 < maxIndex1 && index2 < maxIndex2) {
                if (st1.get(index1) < st2.get(index2)) {
                    resultList.add(st1.get(index1++));
                } else {
                    resultList.add(st2.get(index2++));
                }
            } else if (index1 < maxIndex1) {
                resultList.add(st1.get(index1++));
            } else {
                resultList.add(st2.get(index2++));
            }
        }
        return resultList;
    }
}