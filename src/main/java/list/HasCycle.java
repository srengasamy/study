package list;

public class HasCycle {

  public boolean hasCycle(ListNode head) {
    if (head == null) {
      return false;
    }
    ListNode slow = head;
    ListNode fast = head.next;
    while (fast != null && fast.next != null) {
      if (slow == fast) {
        return true;
      }
      slow = slow.next;
      if (fast.next != null) {
        fast = fast.next.next;
      } else {
        fast = fast.next;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(3);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(0);
    l1.next.next.next = new ListNode(-4);
    l1.next.next.next.next = l1.next;
    System.out.println(new HasCycle().hasCycle(l1));
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }
}
