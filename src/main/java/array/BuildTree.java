package array;

public class BuildTree {

  static int preIndex = 0;

  public TreeNode buildTree(int[] preorder, int[] inorder) {
    return build(preorder, inorder, 0, inorder.length - 1);
  }

  public TreeNode build(int[] preorder, int[] inorder, int start, int end) {
    if (start > end) {
      return null;
    }
    TreeNode root = new TreeNode(preorder[preIndex++]);
    int pivot = start;
    while (pivot <= end) {
      if (inorder[pivot] == root.val) {
        break;
      }
      pivot++;
    }
    root.left = build(preorder, inorder, start, pivot - 1);
    root.right = build(preorder, inorder, pivot + 1, end);
    return root;
  }


  public static void main(String[] args) {
    int[] pre = {3, 9, 20, 15, 7};
    int[] in = {9, 3, 15, 20, 7};
    TreeNode root = new BuildTree().buildTree(pre, in);
    System.out.println(root);
    ;
  }

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
}
