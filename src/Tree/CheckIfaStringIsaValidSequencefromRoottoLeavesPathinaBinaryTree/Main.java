package Tree.CheckIfaStringIsaValidSequencefromRoottoLeavesPathinaBinaryTree;

import Utils.TreeNode;

public class Main{
    public static void main(String[] argv) {
        TreeNode tree1 = new TreeNode(1);
        TreeNode tree3 = new TreeNode(1);
        TreeNode tree2 = new TreeNode(1);
        tree2.left = tree1;
        tree2.right = tree3;
        TreeNode tree7 = new TreeNode(0);
        TreeNode root = new TreeNode(1);
        root.left = tree2;
        root.right = tree7;

        Solution s = new Solution();

        int[] arr = {0,1,1};

        System.out.println(s.isValidSequence(root, arr));
    }
}
