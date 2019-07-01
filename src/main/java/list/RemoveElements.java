package list;

public class RemoveElements {
  public ListNode removeElements(ListNode head, int val) {
    ListNode newHead = new ListNode(-1);
    newHead.next = head;
    ListNode prev = newHead;
    ListNode temp = head;
    while (temp != null) {
      if (temp.val == val) {
        prev.next = temp.next;
        temp = temp.next;
      } else {
        prev = temp;
        temp = temp.next;
      }
    }
    return newHead.next;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(6);
    l1.next.next.next = new ListNode(3);
    l1.next.next.next.next = new ListNode(4);
    l1.next.next.next.next.next = new ListNode(5);
    l1.next.next.next.next.next.next = new ListNode(6);
    ListNode result = new RemoveElements().removeElements(l1, 6);
    System.out.println(result);
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
