package tree;

public class PruneTree {

  public TreeNode pruneTree(TreeNode root) {
    if(root == null){
      return null;
    }
    root.left = pruneTree(root.left);
    root.right = pruneTree(root.right);
    if(root.val == 0 && root.left == null && root.right == null){
      return null;
    }
    return root;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(0);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(1);

    TreeNode result = new PruneTree().pruneTree(root);
    System.out.println(result);
  }
}
