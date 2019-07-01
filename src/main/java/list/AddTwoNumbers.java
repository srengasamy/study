package list;

public class AddTwoNumbers {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int remainder = 0;
    ListNode result = new ListNode(-1);
    ListNode last = result;
    while (l1 != null || l2 != null) {
      int sum = 0;
      if (l1 != null) {
        sum += l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        sum += l2.val;
        l2 = l2.next;
      }
      sum += remainder;
      last.next = new ListNode(sum % 10);
      last = last.next;
      remainder = sum / 10;
    }
    if (remainder != 0) {
      last.next = new ListNode(remainder);
    }
    return result.next;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);
    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);
    ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
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
