package list;

public class Partition {

  public ListNode partition(ListNode head, int x) {
    ListNode less = new ListNode(-1);
    ListNode lessTail = less;
    ListNode greater = new ListNode(-1);
    ListNode greaterTail = greater;

    while (head != null) {
      if (head.val < x) {
        lessTail.next = head;
        lessTail = head;
        head = head.next;
        lessTail.next = null;
      } else {
        greaterTail.next = head;
        greaterTail = head;
        head = head.next;
        greaterTail.next = null;
      }
    }
    lessTail.next = greater.next;
    return less.next;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);
    l1.next.next.next = new ListNode(2);
    l1.next.next.next.next = new ListNode(5);
    l1.next.next.next.next.next = new ListNode(2);
    ListNode res = new Partition().partition(l1, 3);
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
