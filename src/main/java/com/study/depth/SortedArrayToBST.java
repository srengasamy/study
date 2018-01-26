package com.study.depth;

import com.study.common.TreeNode;

public class SortedArrayToBST {
  public static void main(String[] args) {
    int[] nums = {-10, -3, 0, 5, 9};
    TreeNode node = sortedArrayToBST(nums);
    System.out.println(node);
  }

  public static TreeNode sortedArrayToBST(int[] nums) {
    return build(nums, 0, nums.length - 1);
  }

  public static TreeNode build(int[] nums, int l, int r) {
    if (l > r) return null;
    if (l == r) return new TreeNode(nums[l]);
    int mid = (l + r) / 2;
    TreeNode root = new TreeNode(nums[mid]);
    root.left = build(nums, l, mid - 1);
    root.right = build(nums, mid + 1, r);
    return root;
  }
}
