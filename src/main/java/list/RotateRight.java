package list;

public class RotateRight {
  public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null) {
      return head;
    }
    int count = 1;
    ListNode temp = head;
    while (temp.next != null) {
      temp = temp.next;
      count++;
    }
    temp.next = head;
    k = k % count;
    k = count - k;
    temp = head;
    while (k > 0) {
      temp = head;
      head = head.next;
      k--;
    }
    temp.next = null;
    return head;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
//    l1.next.next = new ListNode(3);
//    l1.next.next.next = new ListNode(4);
//    l1.next.next.next.next = new ListNode(5);

    ListNode res = new RotateRight().rotateRight(l1, 2);
    System.out.println(res);
  }

  public ListNode reverseList(ListNode head) {
    ListNode reversed = null;
    while (head != null) {
      ListNode temp = head.next;
      head.next = reversed;
      reversed = head;
      head = temp;
    }
    return reversed;
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
