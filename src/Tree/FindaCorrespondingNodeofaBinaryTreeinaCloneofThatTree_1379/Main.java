package Tree.FindaCorrespondingNodeofaBinaryTreeinaCloneofThatTree_1379;

import Utils.TreeNode;

public class Main{
    public static void main(String[] argv) {
        TreeNode tree1 = new TreeNode(1);
        TreeNode tree3 = new TreeNode(2);
        TreeNode tree2 = new TreeNode(3);
        tree2.left = tree1;
        tree2.right = tree3;
        TreeNode tree7 = new TreeNode(4);
        TreeNode root = new TreeNode(5);
        root.left = tree2;
        root.right = tree7;

        Solution s = new Solution();

        System.out.println((s.getTargetCopy(root, root, tree3)));
    }
}
