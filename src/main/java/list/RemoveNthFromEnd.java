package list;

public class RemoveNthFromEnd {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode slow = head;
    ListNode fast = head;
    while (n-- > 0) {
      fast = fast.next;
    }
    ListNode temp = null;
    while (fast != null) {
      temp = slow;
      slow = slow.next;
      fast = fast.next;
    }
    if (temp == null) {
      return head.next;
    } else {
      temp.next = slow.next;
    }
    return head;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
//    l1.next = new ListNode(2);
//    l1.next.next = new ListNode(3);
//    l1.next.next.next = new ListNode(4);
//    l1.next.next.next.next = new ListNode(5);
    ListNode res = new RemoveNthFromEnd().removeNthFromEnd(l1, 1);
    System.out.println(res);
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
