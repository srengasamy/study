package list;

public class AddTwoNumbers2 {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    l1 = reverseList(l1);
    l2 = reverseList(l2);
    int carry = 0;
    ListNode result = null;
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
      sum += carry;
      ListNode node = new ListNode(sum % 10);
      node.next = result;
      result = node;
      carry = sum / 10;
    }
    if (carry != 0) {
      ListNode node = new ListNode(carry);
      node.next = result;
      return node;
    }
    return result;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(7);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);
    l1.next.next.next = new ListNode(3);

    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);

    ListNode res = new AddTwoNumbers2().addTwoNumbers(l1, l2);
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
