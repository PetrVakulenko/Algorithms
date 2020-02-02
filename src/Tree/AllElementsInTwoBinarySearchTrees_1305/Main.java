package Tree.AllElementsInTwoBinarySearchTrees_1305;

import Utils.TreeNode;

public class Main{
    public static void main(String[] argv) {
        TreeNode root1 = new TreeNode(2);
        TreeNode tree2 = new TreeNode(1);
        TreeNode tree3 = new TreeNode(4);
        root1.left = tree2;
        root1.right = tree3;

        TreeNode root2 = new TreeNode(1);
        TreeNode tree4 = new TreeNode(0);
        TreeNode tree5 = new TreeNode(3);
        root1.left = tree4;
        root1.right = tree5;

        Solution s = new Solution();
        Utils.PrintResult.printListInteger(s.getAllElements(root1, root2));
    }
}
