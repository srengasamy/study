package com.study.depth;

import com.study.common.ListNode;
import com.study.common.TreeNode;

public class SortedListToBST {
  public static void main(String[] args) {
    ListNode node = new ListNode(-10);
    node.next = new ListNode(-3);
    node.next.next = new ListNode(0);
    node.next.next.next = new ListNode(5);
    node.next.next.next.next = new ListNode(9);
    TreeNode root = sortedListToBST(node);
    System.out.println(root);
  }

  public static TreeNode sortedListToBST(ListNode list) {
    if (list == null) return null;
    if (list.next == null) return new TreeNode(list.val);
    ListNode slow = list;
    ListNode fast = list;
    ListNode prev = null;
    while (fast.next != null) {
      prev = slow;
      slow = slow.next;
      fast = fast.next;
      if (fast.next != null) fast = fast.next;
    }
    TreeNode root = new TreeNode(slow.val);
    prev.next = null;
    prev = slow.next;
    slow.next = null;
    root.left = sortedListToBST(list);
    root.right = sortedListToBST(prev);
    return root;
  }
}
