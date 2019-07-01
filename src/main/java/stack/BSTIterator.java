package stack;

import java.util.Stack;

public class BSTIterator {

  Stack<TreeNode> stack = new Stack<>();

  public BSTIterator(TreeNode root) {
    stack.push(root);
  }

  public int next() {
    TreeNode top = stack.pop();
    
    if (top.right != null) {
      stack.push(top.right);
    }
    return top.val;
  }

  public boolean hasNext() {
    return !stack.isEmpty();
  }


  public static void main(String[] args) {
    TreeNode root = new TreeNode(7);
    root.left = new TreeNode(3);
    root.right = new TreeNode(15);
    root.right.left = new TreeNode(9);
    root.right.right = new TreeNode(20);
    BSTIterator iterator = new BSTIterator(root);
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
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
