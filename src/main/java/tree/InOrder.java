package tree;

import java.util.Stack;

public class InOrder {

  public void morris(TreeNode root) {
    while (root != null) {
      if (root.left == null) {
        System.out.println(root.val);
        root = root.right;
      } else {
        TreeNode leftRight = root.left;
        while (leftRight.right != null) {
          leftRight = leftRight.right;
        }
        TreeNode temp = root.left;
        root.left = null;
        leftRight.right = root;
        root = temp;
      }
    }
  }

  public void stack(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    while (root != null || !stack.isEmpty()) {
      while (root != null) {
        stack.push(root);
        root = root.left;
      }
      root = stack.pop();
      System.out.println(root.val);
      root = root.right;
    }
  }

  public void recursive(TreeNode root) {
    if (root == null) {
      return;
    }
    recursive(root.left);
    System.out.println(root.val);
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
    InOrder order = new InOrder();
    order.morris(root);
  }
}
