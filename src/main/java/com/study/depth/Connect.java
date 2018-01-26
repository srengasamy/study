package com.study.depth;

import com.study.common.TreeLinkNode;

public class Connect {
  public static void main(String[] args) {

  }

  public static void connect(TreeLinkNode root) {
    if (root == null) return;
    if (root.left != null && root.right != null) root.left.next = root.right;
    if (root.right != null && root.next != null) root.right.next = root.next.left;
    connect(root.left);
    connect(root.right);
  }
}
