package list;

public class ReverseList {
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

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    ListNode reversed = new ReverseList().reverseList(head);
    System.out.println(reversed);
    ListNode temp = new ReverseList().reverseList(new ListNode(1));
    System.out.println(temp);
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
