package list;

public class ReverseKGroup {

  public ListNode reverseKGroup(ListNode head, int k) {
    ListNode temp = head;
    int count = 0;
    while (count < k) {
      count++;
      temp = temp.next;
    }
    if (count == k) {
      temp = reverseKGroup(temp.next, k);
      while (count-- > 0) {
        ListNode next = head.next;
        head.next = temp;
        temp = head;
        head = next;
      }
      head = temp;
    }
    return head;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(3);
    l1.next.next.next = new ListNode(4);
    l1.next.next.next.next = new ListNode(5);
    l1.next.next.next.next.next = new ListNode(6);
    l1.next.next.next.next.next.next = new ListNode(7);
//    l1.next.next.next.next.next.next.next = new ListNode(8);
//    l1.next.next.next.next.next.next.next.next = new ListNode(9);
    ListNode res = new ReverseKGroup().reverseKGroup(l1, 3);
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
