package list;

public class DeleteDuplicates2 {
  public ListNode deleteDuplicates(ListNode head) {
    ListNode result = new ListNode(-1);
    ListNode tail = result;
    while (head != null) {
      boolean duplicate = false;
      ListNode temp = head.next;
      while (temp != null && temp.val == head.val) {
        duplicate = true;
        temp = temp.next;
      }
      if (duplicate) {
        head = temp;
      } else {
        tail.next = head;
        tail = head;
        head = head.next;
        tail.next = null;
      }
    }
    return result.next;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(3);
    l1.next.next.next = new ListNode(3);
    l1.next.next.next.next = new ListNode(4);
    l1.next.next.next.next.next = new ListNode(4);
    l1.next.next.next.next.next.next = new ListNode(5);
    ListNode res = new DeleteDuplicates2().deleteDuplicates(l1);
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
