package com.study.depth;

import com.study.common.TreeNode;

public class IsSymmetric {
  public static void main(String[] args) {

  }

  public boolean isSymmetric(TreeNode root) {
    return isSymmetric(root, root);
  }

  public boolean isSymmetric(TreeNode a, TreeNode b) {
    if (a == null || b == null) return true;
    if (a == null || b == null) return false;
    return a.val == b.val && isSymmetric(a.left, b.right) && isSymmetric(a.right, b.left);
  }
}
