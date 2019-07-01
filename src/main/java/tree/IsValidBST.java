package tree;

public class IsValidBST {
  public boolean isValidBST(TreeNode root) {
    if (root == null) {
      return true;
    }
    boolean left = root.left == null || findMax(root.left).val <= root.val;
    boolean right = root.right == null || root.val <= findMin(root.right).val;
    return left && right && isValidBST(root.left) && isValidBST(root.right);
  }

  public TreeNode findMin(TreeNode root) {
    if (root.left == null) {
      return root;
    }
    return findMin(root.left);
  }

  public TreeNode findMax(TreeNode root) {
    if (root.right == null) {
      return root;
    }
    return findMax(root.right);
  }

}
