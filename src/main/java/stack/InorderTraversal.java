package stack;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    while (root != null) {
      if (root.left == null) {
        result.add(root.val);
        root = root.right;
      } else {
        TreeNode newRoot = root.left;
        root.left = null;
        TreeNode right = newRoot;
        while (right.right != null) {
          right = right.right;
        }
        right.right = root;
        root = newRoot;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(3);
    System.out.println(new InorderTraversal().inorderTraversal(root));
  }

  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
}
