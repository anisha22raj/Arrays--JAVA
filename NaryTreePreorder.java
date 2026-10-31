
import java.util.*;

public class NaryTreePreorder {

    static class Node {
        public int val;
        public List<Node> children;

        public Node(int val) {
            this.val = val;
            children = new ArrayList<>();
        }
    }

    public static List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        result.add(root.val);

        for (Node child : root.children) {
            result.addAll(preorder(child));
        }

        return result;
    }

    public static void main(String[] args) {

        // Creating an example N-ary tree
        Node root = new Node(1);

        Node node2 = new Node(3);
        Node node3 = new Node(2);
        Node node4 = new Node(4);

        root.children.add(node2);
        root.children.add(node3);
        root.children.add(node4);

        node2.children.add(new Node(5));
        node2.children.add(new Node(6));

        System.out.println("Preorder Traversal: " + preorder(root));
    }
}
