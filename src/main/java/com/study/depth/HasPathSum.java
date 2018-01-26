package com.study.depth;

import com.study.common.TreeNode;

public class HasPathSum {
  public static void main(String[] args) {

  }

  public boolean hasPathSum(TreeNode root, int sum) {
    if (root == null && sum == 0) return true;
    else if (root == null && sum != 0) return false;
    return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
  }
}
