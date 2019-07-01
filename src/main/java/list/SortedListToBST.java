package list;

public class SortedListToBST {
  public TreeNode sortedListToBST(ListNode head) {
    ListNode temp = head;
    if (head == null) {
      return null;
    }
    if (head.next == null) {
      return new TreeNode(head.val);
    }
    ListNode slow = head;
    ListNode fast = head;
    ListNode last = null;
    while (fast != null && fast.next != null) {
      last = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    if (last != null) {
      last.next = null;
    }
    TreeNode result = new TreeNode(slow.val);
    if (last != null) {
      result.left = sortedListToBST(temp);
    }
    if (slow.next != null) {
      result.right = sortedListToBST(slow.next);
    }
    return result;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(-10);
    l1.next = new ListNode(-3);
    l1.next.next = new ListNode(0);
    l1.next.next.next = new ListNode(5);
    l1.next.next.next.next = new ListNode(9);
    TreeNode node = new SortedListToBST().sortedListToBST(l1);
    System.out.println(node);
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
}
