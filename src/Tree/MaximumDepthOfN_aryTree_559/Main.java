package Tree.MaximumDepthOfN_aryTree_559;

import Utils.Node;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] argv) {

        List<Node> l5 = new ArrayList<>();

        Node n5 = new Node(5, l5);
        Node n6 = new Node(6, l5);
        Node n2 = new Node(2, l5);
        Node n4 = new Node(4, l5);

        List<Node> l3 = new ArrayList<>();
        l3.add(n5);
        l3.add(n6);
        Node n3 = new Node(3, l3);

        List<Node> l1 = new ArrayList<>();
        l1.add(n3);
        l1.add(n2);
        l1.add(n4);
        Node n1 = new Node(1, l1);

        Solution s = new Solution();
        System.out.println("Result:");
        System.out.println(s.maxDepth(n1));
    }
}
