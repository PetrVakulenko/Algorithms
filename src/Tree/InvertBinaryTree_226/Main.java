package Tree.InvertBinaryTree_226;

import Utils.TreeNode;

public class Main{
    public static void main(String[] argv) {
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(3);
        tree1.right = new TreeNode(2);
        tree1.left.left = new TreeNode(5);
        System.out.println("Tree1:");
        TreeNode.inorder(tree1);
        System.out.println();

        TreeNode tree2 = new TreeNode(2);
        tree2.left = new TreeNode(1);
        tree2.left.right = new TreeNode(4);
        tree2.right = new TreeNode(3);
        tree2.right.right = new TreeNode(7);
        System.out.println("Tree2:");
        TreeNode.inorder(tree2);
        System.out.println();

        Solution s = new Solution();
        TreeNode resultTree = s.mergeTrees(tree1, tree2);
        System.out.println("Result:");
        TreeNode.inorder(resultTree);
    }
}
