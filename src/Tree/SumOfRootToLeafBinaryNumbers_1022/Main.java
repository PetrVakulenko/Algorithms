package Tree.SumOfRootToLeafBinaryNumbers_1022;

import Utils.TreeNode;

public class Main{
    public static void main(String[] argv) {
        TreeNode tree1 = new TreeNode(0);
        TreeNode tree2 = new TreeNode(1);
        TreeNode tree3 = new TreeNode(0);
        tree3.left = tree1;
        tree3.right = tree2;

        TreeNode tree4 = new TreeNode(0);
        TreeNode tree5 = new TreeNode(1);
        TreeNode tree6 = new TreeNode(1);
        tree6.left = tree4;
        tree6.right = tree5;

        TreeNode root = new TreeNode(1);
        root.left = tree3;
        root.right = tree6;

        Solution s = new Solution();
        int res = s.sumRootToLeaf(root);
        System.out.println(res);
    }
}
