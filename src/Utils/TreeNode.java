package Utils;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    /* Given a binary tree, print its nodes in inorder*/
    public static void inorder(TreeNode node)
    {
        if (node == null) {
            return;
        }

        /* first recur on left child */
        inorder(node.left);

        /* then print the data of node */
        System.out.printf("%d ", node.val);

        /* now recur on right child */
        inorder(node.right);
    }
}
