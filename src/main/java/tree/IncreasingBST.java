package tree;

import java.util.Stack;

public class IncreasingBST {
  public TreeNode increasingBST(TreeNode root) {
    if (root == null) {
      return null;
    }
    Stack<TreeNode> stack = new Stack();
    TreeNode result = new TreeNode(-1);
    TreeNode last = result;
    while (root != null || !stack.isEmpty()) {
      while (root != null) {
        stack.push(root);
        root = root.left;
      }
      root = stack.pop();
      last.right = root;
      last = root;
      root = root.right;
    }
    return result.right;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(4);
    root.left.left.left = new TreeNode(1);
    root.right = new TreeNode(6);
    root.right.right = new TreeNode(8);
    root.right.right.left = new TreeNode(7);
    root.right.right.right = new TreeNode(9);

    TreeNode result = new IncreasingBST().increasingBST(root);
    System.out.println(result);
  }
}
