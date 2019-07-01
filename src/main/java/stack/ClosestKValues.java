package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

public class ClosestKValues {
  public List<Integer> closestKValues2(TreeNode root, double target, int k) {
    Stack<TreeNode> temp = new Stack<>();
    Stack<Integer> pre = new Stack<>();
    Stack<Integer> suc = new Stack<>();
    TreeNode node = root;
    while (node != null || !temp.isEmpty()) {
      while (node != null) {
        temp.push(node);
        node = node.left;
      }
      node = temp.pop();
      if (node.val > target) {
        break;
      }
      pre.push(node.val);
      node = node.right;
    }
    node = root;
    temp = new Stack<>();
    while (node != null || !temp.isEmpty()) {
      while (node != null) {
        temp.push(node);
        node = node.right;
      }
      node = temp.pop();
      if (node.val <= target) {
        break;
      }
      suc.push(node.val);
      node = node.left;
    }
    List<Integer> result = new ArrayList<>();
    while (!pre.isEmpty() || !suc.isEmpty()) {
      if (!pre.isEmpty() && !suc.isEmpty()) {
        if (Math.abs(pre.peek() - target) < Math.abs(suc.peek() - target)) {
          result.add(pre.pop());
        } else {
          result.add(suc.pop());
        }
      } else if (pre.isEmpty()) {
        result.add(suc.pop());
      } else {
        result.add(pre.pop());
      }
      if (result.size() == k) {
        break;
      }
    }
    return result;
  }

  public List<Integer> closestKValues(TreeNode root, double target, int k) {
    Stack<TreeNode> stack = new Stack<>();
    PriorityQueue<TreeNode> queue = new PriorityQueue<>(((o1, o2) -> Double.compare(Math.abs(o2.val - target), Math.abs(o1.val - target))));
    while (root != null || !stack.isEmpty()) {
      while (root != null) {
        stack.push(root);
        root = root.left;
      }
      root = stack.pop();
      if (queue.size() < k) {
        queue.offer(root);
      } else if (Math.abs(root.val - target) < Math.abs(queue.peek().val - target)) {
        queue.poll();
        queue.offer(root);
      } else {
        break;
      }
      root = root.right;
    }
    List<Integer> results = new ArrayList<>();
    while (!queue.isEmpty()) {
      results.add(queue.poll().val);
    }
    return results;
  }


  public static void main(String[] args) {
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.right = new TreeNode(5);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    System.out.println(new ClosestKValues().closestKValues2(root, 3.714286, 2));
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
