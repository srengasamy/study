package list;

public class DeleteNode {
  public void deleteNode(ListNode node) {
    if (node.next == null) {
      return;
    }
    ListNode temp = node.next.next;
    node.val = node.next.val;
    node.next = temp;
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
