package Tree.PathSum_112;

import Utils.TreeNode;

public class Main{
    public static void main(String[] argv) {
        Solution s = new Solution();

        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(3);
        tree1.right = new TreeNode(2);
        tree1.left.left = new TreeNode(5);
        System.out.println(s.hasPathSum(tree1, 2));
    }
}
