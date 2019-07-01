package list;

public class Flatten {

  public Node flatten(Node head) {
    Node result = new Node();
    Node tail = result;
    flatten(head, tail);
    return result.next;
  }

  public Node flatten(Node head, Node tail) {
    if (head == null) {
      return tail;
    }
    tail.next = head;
    tail = tail.next;
    Node next = head.next;
    tail = flatten(head.child, tail);
    tail = flatten(next, tail);
    return tail;
  }

  public static void main(String[] args) {
    Node one = new Node(1);
    one.next = new Node(2);
    one.next.next = new Node(3);
    one.next.next.next = new Node(4);
    one.next.next.next.next = new Node(5);
    one.next.next.next.next.next = new Node(6);

    Node two = new Node(7);
    two.next = new Node(8);
    two.next.next = new Node(9);
    two.next.next.next = new Node(10);

    Node three = new Node(11);
    three.next = new Node(12);

    two.next.child = three;
    one.next.next.child = two;

    Node result = new Flatten().flatten(one);
    System.out.println(result);
  }

  static class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node(int val) {
      this.val = val;
    }

    public Node() {
    }

    public Node(int _val, Node _prev, Node _next, Node _child) {
      val = _val;
      prev = _prev;
      next = _next;
      child = _child;
    }
  }

  ;
}
