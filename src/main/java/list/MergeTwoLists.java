package list;

public class MergeTwoLists {

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode head = new ListNode(-1);
    ListNode temp = head;
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        temp.next = l1;
        l1 = l1.next;
      } else {
        temp.next = l2;
        l2 = l2.next;
      }
      temp = temp.next;
    }
    if (l1 != null) {
      temp.next = l1;
    } else {
      temp.next = l2;
    }
    return head.next;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);

    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);


    ListNode result = new MergeTwoLists().mergeTwoLists(l1, l2);
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
