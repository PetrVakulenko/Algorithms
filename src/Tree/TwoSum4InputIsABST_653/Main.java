package Tree.TwoSum4InputIsABST_653;

import Utils.TreeNode;

public class Main{
    public static void main(String[] argv) {
        TreeNode tree1 = new TreeNode(5);
        TreeNode tree2 = new TreeNode(3);
        TreeNode tree3 = new TreeNode(6);
        tree1.left = tree2;
        tree1.right = tree3;
        TreeNode tree4 = new TreeNode(2);
        TreeNode tree5 = new TreeNode(4);
        TreeNode tree6 = new TreeNode(7);
        tree2.left = tree4;
        tree2.right = tree5;
        tree3.right = tree6;

        Solution s = new Solution();
        System.out.println(s.findTarget(tree1, 7));
    }
}
