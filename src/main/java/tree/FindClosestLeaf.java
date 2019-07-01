package tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FindClosestLeaf {
  public int findClosestLeaf(TreeNode root, int k) {
    if (root == null) {
      return -1;
    }
    Map<Integer, Integer> leafs = new HashMap<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    int foundAt = -1;
    int level = 0;
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        root = queue.poll();
        if (root.val == k) {
          foundAt = level;
        }
        if (root.left == null && root.right == null) {
          leafs.put(level, root.val);
        }
        if (root.left != null) {
          queue.offer(root.left);
        }
        if (root.right != null) {
          queue.offer(root.right);
        }
      }
      level++;
    }
    int result = -1;
    int distance = Integer.MAX_VALUE;
    for (Map.Entry<Integer, Integer> entry : leafs.entrySet()) {
      if (Math.abs(entry.getKey() - foundAt) < distance) {
        distance = Math.abs(entry.getKey() - foundAt);
        result = entry.getValue();
      }
    }
    return result;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.left.left = new TreeNode(5);
    root.left.left.left.left = new TreeNode(6);
    System.out.println(new FindClosestLeaf().findClosestLeaf(root, 2));
  }
}
