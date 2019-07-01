package list;

public class InsertionSortList {
  public ListNode insertionSortList(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode result = head;
    head = head.next;
    result.next = null;
    while (head != null) {
      ListNode temp = result;
      ListNode last = null;
      while (temp != null && temp.val < head.val) {
        last = temp;
        temp = temp.next;
      }
      ListNode next = head.next;
      if (last == null) {
        head.next = result;
        result = head;
      } else {
        head.next = last.next;
        last.next = head;
      }
      head = next;
    }
    return result;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(-1);
    l1.next = new ListNode(5);
    l1.next.next = new ListNode(3);
    l1.next.next.next = new ListNode(4);
    l1.next.next.next.next = new ListNode(0);
    ListNode res = new InsertionSortList().insertionSortList(l1);
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
