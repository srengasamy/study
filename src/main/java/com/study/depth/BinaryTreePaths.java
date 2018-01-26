package com.study.depth;

import com.study.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
  public static void main(String[] args) {

  }

  public List<String> binaryTreePaths(TreeNode root) {
    if (root == null) return new ArrayList<>();
    List<String> left = binaryTreePaths(root.left);
    List<String> right = binaryTreePaths(root.right);
    List<String> result = new ArrayList<>();
    for (int i = 0; i < left.size(); i++) result.add(root.val + "->" + left.get(i));
    for (int i = 0; i < right.size(); i++) result.add(root.val + "->" + right.get(i));
    if (result.isEmpty()) result.add(root.val + "");
    return result;
  }
}
