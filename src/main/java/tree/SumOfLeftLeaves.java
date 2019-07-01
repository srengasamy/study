package tree;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfLeftLeaves {

  public int sumOfLeftLeaves(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    int sum = 0;
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        if (node.left != null && node.left.left == null && node.left.right == null) {
          sum += node.left.val;
        }
        if (node.left != null) {
          queue.offer(node.left);
        }
        if (node.right != null) {
          queue.offer(node.right);
        }
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    System.out.println(new SumOfLeftLeaves().sumOfLeftLeaves(root));
  }
}
