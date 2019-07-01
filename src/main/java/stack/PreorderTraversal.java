package stack;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> results = new ArrayList<>();
    return results;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(3);

    System.out.println(new PreorderTraversal().preorderTraversal(root));
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
