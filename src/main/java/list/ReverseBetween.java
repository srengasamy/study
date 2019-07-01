package list;

public class ReverseBetween {
  public ListNode reverseBetween(ListNode head, int m, int n) {
    ListNode curr = head;
    ListNode mNode = null;
    ListNode nNode = null;
    ListNode reversed = null;
    for (int i = 1; i <= n; i++) {
      if (i < m) {
        mNode = curr;
        curr = curr.next;
      } else {
        if (nNode == null) {
          nNode = curr;
        }
        ListNode next = curr.next;
        curr.next = reversed;
        reversed = curr;
        curr = next;
        if (i == n) {
          if (mNode != null) {
            mNode.next = reversed;
          }
          nNode.next = next;
          break;
        }
      }
    }
    return head;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(3);
    l1.next.next.next = new ListNode(4);
    l1.next.next.next.next = new ListNode(5);
    ListNode result = new ReverseBetween().reverseBetween(l1, 1, 3);
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
