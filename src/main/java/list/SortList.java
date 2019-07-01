package list;

public class SortList {

  public ListNode sortList(ListNode head) {
    return quicksort(head)[0];
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(-1);
    l1.next = new ListNode(5);
    l1.next.next = new ListNode(3);
    l1.next.next.next = new ListNode(4);
    l1.next.next.next.next = new ListNode(0);
    ListNode result = new SortList().sortList(l1);
    System.out.println(result);
  }

  public ListNode[] quicksort(ListNode head) {
    if (head.next == null) {
      return new ListNode[]{head, head};
    }
    ListNode partition = head;
    head = head.next;
    ListNode less = new ListNode(-1);
    ListNode lessLast = less;
    ListNode greater = new ListNode(-1);
    ListNode greaterLast = greater;
    while (head != null) {
      if (head.val <= partition.val) {
        lessLast.next = head;
        head = head.next;
        lessLast = lessLast.next;
        lessLast.next = null;
      } else {
        greaterLast.next = head;
        head = head.next;
        greaterLast = greaterLast.next;
        greaterLast.next = null;
      }
    }
    ListNode[] leftSorted = less == lessLast ? null : quicksort(less.next);
    ListNode[] rightSorted = greater == greaterLast ? null : quicksort(greater.next);
    if (leftSorted != null) {
      leftSorted[1].next = partition;
    }
    partition.next = rightSorted == null ? null : rightSorted[0];
    ListNode[] result = new ListNode[2];
    result[0] = leftSorted == null ? partition : leftSorted[0];
    result[1] = rightSorted == null ? partition : rightSorted[1];
    return result;
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
