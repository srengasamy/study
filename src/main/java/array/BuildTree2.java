package array;

import java.util.HashMap;
import java.util.Map;

public class BuildTree2 {
  int postIndex = 0;
  Map<Integer, Integer> idx = new HashMap<>();

  public TreeNode buildTree(int[] inorder, int[] postorder) {
    postIndex = postorder.length - 1;
    for (int i = postIndex; i >= 0; i--) {
      idx.put(inorder[i], i);
    }
    return build(inorder, postorder, 0, postIndex);
  }

  public TreeNode build(int[] inorder, int[] postorder, int s, int e) {
    if (s > e) {
      return null;
    }
    TreeNode root = new TreeNode(postorder[postIndex--]);
    int pivot = idx.get(root.val);
    root.right = build(inorder, postorder, pivot + 1, e);
    root.left = build(inorder, postorder, s, pivot - 1);
    return root;
  }

  public static void main(String[] args) {
    int[] in = {9, 3, 15, 20, 7};
    int[] post = {9, 15, 7, 20, 3};
    TreeNode root = new BuildTree2().buildTree(in, post);
    System.out.println(root);
  }

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
}
