package com.study.depth;

import com.study.common.TreeNode;

public class IsBalanced {
  public static void main(String[] args) {

  }

  public static boolean isBalanced(TreeNode node) {
    return height(node) != -1;
  }

  public static int height(TreeNode node) {
    if (node == null) return 0;
    int left = height(node.left);
    if (left == -1) return -1;
    int right = height(node.right);
    if (right == -1) return -1;
    return Math.abs(right - left) <= 1 ? Math.max(right, left) : -1;
  }
}
