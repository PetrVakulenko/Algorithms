package Graph.CloneGraph_133;

import Utils.Node;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Node node = new Node(1);

        List<Node> neighbours = new ArrayList();
        neighbours.add(node);

        Node node1 = new Node(2, neighbours);

        Solution s = new Solution();

        System.out.println(s.cloneGraph(node1));
    }
}
