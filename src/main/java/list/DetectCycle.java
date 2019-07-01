package list;

public class DetectCycle {
  public ListNode detectCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        slow = head;
        while (slow != fast) {
          slow = slow.next;
          fast = fast.next;
        }
        return slow;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(3);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(0);
    l1.next.next.next = new ListNode(-4);
//    l1.next.next.next.next = l1.next;

    ListNode result = new DetectCycle().detectCycle(l1);
    System.out.println(result);
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
