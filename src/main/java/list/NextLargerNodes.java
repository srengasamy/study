package list;

import java.util.Stack;

public class NextLargerNodes {

  public int[] nextLargerNodes(ListNode head) {
    Stack<Integer> stack = new Stack<>();
    int count = 0;
    ListNode temp = head;
    while (temp != null) {
      temp = temp.next;
      count++;
    }
    int[] result = new int[count];
    temp = head;
    int i = 0;
    while (temp != null) {
      while (!stack.isEmpty() && stack.peek() < temp.val) {
        System.out.println(stack.pop() + "==>" + temp.val);
      }
      stack.push(temp.val);
      temp = temp.next;
    }
    return null;
  }


  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(7);
    l1.next.next = new ListNode(5);
    l1.next.next.next = new ListNode(1);
    l1.next.next.next.next = new ListNode(9);
    l1.next.next.next.next.next = new ListNode(2);
    l1.next.next.next.next.next.next = new ListNode(5);
    l1.next.next.next.next.next.next.next = new ListNode(1);
    int[] res = new NextLargerNodes().nextLargerNodes(l1);
    System.out.println();
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
