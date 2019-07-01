package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(5);
    new BinaryTreePaths().binaryTreePaths(root, new ArrayList<>());
  }


  public void binaryTreePaths(TreeNode root, List<String> results) {
    if(root == null){
      return;
    }
    if(root.left == null && root.right == null){
      System.out.println(results.toString()+root.val+"");
      return;
    }
    results.add(root.val + "");
    binaryTreePaths(root.left, results);
    binaryTreePaths(root.right, results);
    results.remove(root);
  }

}
