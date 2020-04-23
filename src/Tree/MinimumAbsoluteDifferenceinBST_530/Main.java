package Tree.MinimumAbsoluteDifferenceinBST_530;

import Utils.TreeNode;

public class Main{
    public static void main(String[] argv) {
        TreeNode tree1 = new TreeNode(-8);
        TreeNode tree2 = new TreeNode(7);
        TreeNode tree3 = new TreeNode(7);
        tree3.left = tree2;
        tree3.right = tree1;
        TreeNode tree7 = new TreeNode(0);
        TreeNode root = new TreeNode(1);
        root.left = tree3;
        root.right = tree7;

        Solution s = new Solution();
        System.out.println(s.getMinimumDifference(root));
    }
}
