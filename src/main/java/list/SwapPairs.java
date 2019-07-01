package list;

public class SwapPairs {
  public ListNode swapPairs(ListNode head) {
    ListNode result = new ListNode(-1);
    ListNode last = result;
    while (head != null && head.next != null) {
      ListNode remain = head.next.next;
      head.next.next = null;
      ListNode temp = head.next;
      temp.next = head;
      last.next = temp;
      last = head;
      head = remain;
    }
    last.next = head;
    return result.next;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(3);
    l1.next.next.next = new ListNode(4);
    l1.next.next.next.next = new ListNode(5);
    ListNode res = new SwapPairs().swapPairs(l1);
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
