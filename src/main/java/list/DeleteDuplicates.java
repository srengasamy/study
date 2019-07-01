package list;

public class DeleteDuplicates {

  public ListNode deleteDuplicates(ListNode head) {
    ListNode temp = head;
    while (temp != null) {
      ListNode diff = temp.next;
      while (diff != null && diff.val == temp.val) {
        diff = diff.next;
      }
      temp.next = diff;
      temp = temp.next;
    }
    return head;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(1);
    l1.next.next = new ListNode(2);
    ListNode result = new DeleteDuplicates().deleteDuplicates(l1);
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
