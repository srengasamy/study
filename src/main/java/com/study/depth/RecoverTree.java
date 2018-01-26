package com.study.depth;

import com.study.common.TreeNode;

public class RecoverTree {
  private TreeNode firstElement;
  private TreeNode secondElement;
  private TreeNode prev = new TreeNode(Integer.MIN_VALUE);

  public static void main(String[] args) {

  }

  public void traverse(TreeNode root) {
    if (root == null) return;
    traverse(root.left);
    if (firstElement == null && prev.val > root.val) firstElement = prev;
    if (secondElement == null && prev.val > root.val) secondElement = root;
    prev = root;
    traverse(root.right);
  }

  public void recoverTree(TreeNode root) {
    traverse(root);
    int temp = firstElement.val;
    firstElement.val = secondElement.val;
    secondElement.val = temp;
  }

}
