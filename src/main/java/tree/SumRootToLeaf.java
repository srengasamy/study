package tree;

public class SumRootToLeaf {
  public int sumRootToLeaf(TreeNode root) {
    int result = sum(root, "");
    return result;
  }

  public int sum(TreeNode root, String value) {
    if (root == null) {
      return 0;
    }
    value = value + root.val;
    if (root.left == null && root.right == null) {
      return Integer.parseInt(value, 2);
    }
    int left = sum(root.left, value);
    int right = sum(root.right, value);
    return left + right;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(0);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(1);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(1);
    System.out.println(new SumRootToLeaf().sumRootToLeaf(root));

  }
}
