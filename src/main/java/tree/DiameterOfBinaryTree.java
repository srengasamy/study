package tree;

public class DiameterOfBinaryTree {
  public int diameterOfBinaryTree(TreeNode root) {
    if(root == null){
      return 0;
    }
    int left = diameterOfBinaryTree(root.left);
    int right = diameterOfBinaryTree(root.right);
    return Math.max(Math.max(left, right), height(root.left) + height(root.right)+1);
  }

  public int height(TreeNode root){
    if(root == null){
      return 0;
    }
    return Math.max(height(root.left), height(root.right)) +1;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    System.out.println(new DiameterOfBinaryTree().diameterOfBinaryTree(root));
  }
}
