package Tree.MinimumDepthOfBinaryTree_111;

import Utils.TreeNode;

public class Main{
    public static void main(String[] argv) {
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(3);
        tree1.right = new TreeNode(2);
        tree1.left.left = new TreeNode(5);

        Solution s = new Solution();
        System.out.println(s.minDepth(tree1));
    }
}
