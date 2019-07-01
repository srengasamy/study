package list;

public class ReorderList {

  public void reorderList(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      if (fast != null) {
        slow = slow.next;
      }
    }
    ListNode reversed = reverseList(slow.next);
    slow.next = null;
    ListNode result = new ListNode(-1);
    ListNode tail = result;
    while (head != null || reversed != null) {
      if (head != null) {
        tail.next = head;
        head = head.next;
        tail = tail.next;
      }
      if (reversed != null) {
        tail.next = reversed;
        reversed = reversed.next;
        tail = tail.next;
      }
    }
    head = result.next;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    //l1.next.next = new ListNode(3);
    //l1.next.next.next = new ListNode(4);
//    l1.next.next.next.next = new ListNode(5);
    new ReorderList().reorderList(l1);
    System.out.println(l1);
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
