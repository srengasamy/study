package list;

public class CopyRandomList {
  public Node copyRandomList(Node head) {
    if (head == null) {
      return null;
    }
    Node temp = head;
    while (temp != null) {
      Node next = temp.next;
      Node copy = new Node();
      copy.val = temp.val;
      temp.next = copy;
      copy.next = next;
      temp = next;
    }
    temp = head;
    while (temp != null) {
      Node copy = temp.next;
      copy.random = temp.random != null ? temp.random.next : null;
      temp = temp.next.next;
    }
    temp = head;
    Node result = temp.next;
    while (temp != null) {
      Node next = temp.next.next;
      Node copy = temp.next;
      temp.next = next;
      if (next != null) {
        copy.next = next.next;
      }
      temp = temp.next;
    }
    return result;
  }

  public static void main(String[] args) {
    Node n2 = new Node();
    n2.val = 2;
    n2.random = n2;
    Node n1 = new Node(1, n2, n2);
    Node copy = new CopyRandomList().copyRandomList(n1);
    System.out.println(copy);
  }

  static class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {
    }

    public Node(int _val, Node _next, Node _random) {
      val = _val;
      next = _next;
      random = _random;
    }
  }

  ;
}
