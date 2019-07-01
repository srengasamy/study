package list;

public class OddEvenList {
  public ListNode oddEvenList(ListNode head) {
    ListNode odd = new ListNode(-1);
    ListNode even = new ListNode(-1);
    ListNode oddEnd = odd;
    ListNode evenEnd = even;
    ListNode tail = head;
    int i = 1;
    while (tail != null) {
      if (i % 2 == 0) {
        evenEnd.next = tail;
        evenEnd = evenEnd.next;
      } else {
        oddEnd.next = tail;
        oddEnd = oddEnd.next;
      }
      tail = tail.next;
      i++;
    }
    evenEnd.next = null;
    oddEnd.next = even.next;
    return odd.next;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(3);
    l1.next.next.next = new ListNode(4);
    l1.next.next.next.next = new ListNode(5);
    ListNode result = new OddEvenList().oddEvenList(l1);
    System.out.println();
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
