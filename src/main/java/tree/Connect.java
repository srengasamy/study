package tree;

public class Connect {

  public Node connect(Node root) {
    Node current = root;
    Node headOfNextLevel = null;
    Node previous = null;
    while (current != null) {
      if (current.left != null) {
        if (previous == null) {
          headOfNextLevel = current.left;
        } else {
          previous.next = current.left;
        }
        previous = current.left;
      }
      if (current.right != null) {
        if (previous == null) {
          headOfNextLevel = current.right;
        } else {
          previous.next = current.right;
        }
        previous = current.right;
      }
      current = current.next;
      if (current == null) {
        current = headOfNextLevel;
        headOfNextLevel = null;
        previous = null;
      }
    }
    return root;
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.right = new Node(7);

    Node result = new Connect().connect(root);

    System.out.println(result);
  }
  public static class Node {
    int val;
    Node left;
    Node right;
    Node next;

    public Node(int val) {
      this.val = val;
    }
  }
}
