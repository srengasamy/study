package com.study.pointer;

import com.study.common.ListNode;

public class RotateRight {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head = rotateRight(head, 2);
    System.out.println(head);
  }

  public static ListNode rotateRight(ListNode head, int k) {
    int length = 1;
    ListNode tail = head;
    while (tail.next != null) {
      tail = tail.next;
      length++;
    }
    tail.next = head;
    k = length - (k % length);
    while (k-- > 1) head = head.next;
    tail = head.next;
    head.next = null;
    return tail;
  }
}
