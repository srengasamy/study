package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ZigzagLevelOrder {

  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    Stack<TreeNode> temp = new Stack<>();
    stack.push(root);
    boolean left2Right = true;
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> row = new ArrayList<>();
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      row.add(node.val);
      if (left2Right) {
        if (node.left != null) {
          temp.push(node.left);
        }
        if (node.right != null) {
          temp.push(node.right);
        }
      } else {
        if (node.right != null) {
          temp.push(node.right);
        }
        if (node.left != null) {
          temp.push(node.left);
        }
      }
      if (stack.isEmpty()) {
        stack = temp;
        temp = new Stack<>();
        result.add(row);
        row = new ArrayList<>();
        left2Right = !left2Right;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    List<List<Integer>> results = new ZigzagLevelOrder().zigzagLevelOrder(root);
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
