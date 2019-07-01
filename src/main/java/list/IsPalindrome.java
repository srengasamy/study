package list;

public class IsPalindrome {

  public boolean isPalindrome(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    ListNode reversed = reverseList(slow.next);
    slow.next = null;
    while (head != null && reversed != null && head.val == reversed.val) {
      head = head.next;
      reversed = reversed.next;
    }
    return reversed == null && (head == null || head.next == null);
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    //l1.next = new ListNode(1);
    //l1.next.next = new ListNode(3);
    //l1.next.next.next = new ListNode(2);
    //l1.next.next.next.next = new ListNode(1);
    //l1.next.next.next.next.next = new ListNode(1);
    System.out.println(new IsPalindrome().isPalindrome(l1));
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
