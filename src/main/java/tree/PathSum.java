package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PathSum {
  public int pathSum(TreeNode root, int sum) {
    if (root == null) {
      return 0;
    }
    int result = 0;
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    List<Integer> values = new ArrayList<>();
    while (!stack.isEmpty()) {
      root = stack.pop();
      values.add(root.val);
      if (root.right != null) {
        stack.push(root.right);
      }
      if (root.left != null) {
        stack.push(root.left);
      }
      int localSum = 0;
      for (int i = values.size() - 1; i >= 0; i--) {
        localSum += values.get(i);
        if (localSum == sum) {
          result++;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(5);
    root.right = new TreeNode(-3);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(1);
  }
}
