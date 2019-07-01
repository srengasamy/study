package tree;

import java.util.Stack;

public class PreOrder {

  public void morris(TreeNode root) {
    while (root != null) {
      System.out.println(root.val);
      if (root.right == null) {
        root = root.left;
      } else if (root.left == null) {
        root = root.right;
      } else {
        TreeNode rightEnd = root.left;
        while (rightEnd.right != null) {
          rightEnd = rightEnd.right;
        }
        rightEnd.right = root.right;
        root = root.left;
      }
    }
  }

  public void stack(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      root = stack.pop();
      System.out.println(root.val);
      if (root.right != null) {
        stack.push(root.right);
      }
      if (root.left != null) {
        stack.push(root.left);
      }
    }
  }

  public void recursive(TreeNode root) {
    if (root == null) {
      return;
    }
    System.out.println(root.val);
    recursive(root.left);
    recursive(root.right);
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);
    root.left.left.left = new TreeNode(8);
    root.left.left.right = new TreeNode(9);
    PreOrder order = new PreOrder();
    order.morris(root);
  }
}
