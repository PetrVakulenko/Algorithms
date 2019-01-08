package Tree.MaximumBinaryTree__654;

import Utils.TreeNode;

public class Main{
    public static void main(String[] argv) {
        int[] input = {3,2,1,6,0,5};

        Solution s = new Solution();

        TreeNode resultTree = s.constructMaximumBinaryTree(input);
        System.out.println("Result:");
        TreeNode.inorder(resultTree);
    }
}
