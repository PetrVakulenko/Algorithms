package Tree.ConstructBinarySearchTreeFromPreorderTraversal_1008;

import Utils.TreeNode;

public class Main{
    public static void main(String[] argv) {
        int[] traversal = {8,5,1,7,10,12};

        Solution s = new Solution();

        TreeNode result = s.bstFromPreorder(traversal);

        System.out.println(TreeNode.printTreeNode(result));
    }
}
