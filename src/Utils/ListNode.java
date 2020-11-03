package Utils;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
    }

    public ListNode() {
    }

    /* Given a binary tree, print its nodes in inorder*/
    public static void inorder(ListNode node)
    {
        if (node == null) {
            return;
        }

        /* first recur on left child */
        inorder(node.next);

        /* then print the data of node */
        System.out.printf("%d ", node.val);
    }
}