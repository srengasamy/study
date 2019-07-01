package list;

import java.util.Stack;

public class GetIntersectionNode {

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    Stack<ListNode> a = new Stack<>();
    Stack<ListNode> b = new Stack<>();
    ListNode temp = headA;
    while (temp != null) {
      a.push(temp);
      temp = temp.next;
    }
    temp = headB;
    while (temp != null) {
      b.push(temp);
      temp = temp.next;
    }

    ListNode result = null;
    while (!a.empty() && !b.empty() && a.peek() == b.peek()) {
      result = a.pop();
      b.pop();
    }
    return result;
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }
}
