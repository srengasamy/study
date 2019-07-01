package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversal {

  public List<Integer> postorderTraversal(TreeNode root) {
    Stack<Integer> results = new Stack<>();
    Stack<TreeNode> preorder = new Stack<>();
    preorder.push(root);
    while (!preorder.isEmpty()) {
      TreeNode node = preorder.pop();
      results.push(node.val);
      if (node.left != null) {
        preorder.push(node.left);
      }
      if (node.right != null) {
        preorder.push(node.right);
      }
    }
    List<Integer> res = new ArrayList<>();
    while (!results.isEmpty()){
      res.add(results.pop());
    }
    return results;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);
    List<Integer> results = new PostorderTraversal().postorderTraversal(root);
    System.out.println(results);
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
