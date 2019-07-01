package heap;

import java.util.PriorityQueue;

public class MergeKLists {
  public static void main(String[] args) {
    ListNode one = new ListNode(1);
    one.next = new ListNode(4);
    one.next.next = new ListNode(5);

    ListNode two = new ListNode(1);
    two.next = new ListNode(3);
    two.next.next = new ListNode(4);

    ListNode three = new ListNode(2);
    three.next = new ListNode(6);

    ListNode[] nodes = {one, two, three};
    System.out.println();
    ListNode result = new MergeKLists().mergeKLists(new ListNode[0]);
  }

  public ListNode mergeKLists(ListNode[] lists) {
    if (lists == null || lists.length == 0) return null;
    PriorityQueue<ListNode> queue = new PriorityQueue<>(((o1, o2) -> o1.val - o2.val));
    ListNode head = new ListNode(-1);
    ListNode last = head;
    for (int i = 0; i < lists.length; i++) {
      queue.add(lists[i]);
    }
    while (!queue.isEmpty()) {
      ListNode node = queue.poll();
      ListNode temp = node.next;
      node.next = null;
      last.next = node;
      last = node;
      if (temp != null) {
        queue.add(temp);
      }
    }
    return head.next;
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
