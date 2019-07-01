package tree;

public class SortedArrayToBST {
  public TreeNode sortedArrayToBST(int[] nums) {
    return build(nums, 0, nums.length - 1);
  }

  public TreeNode build(int[] nums, int i, int j) {
    if (i > j) {
      return null;
    }
    if (i == j) {
      return new TreeNode(nums[i]);
    }
    int mid = (i + j) / 2;
    TreeNode root = new TreeNode(nums[mid]);
    root.left = build(nums, i, mid - 1);
    root.right = build(nums, mid + 1, j);
    return root;
  }

  public static void main(String[] args) {
    TreeNode result = new SortedArrayToBST().sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
    System.out.println();
  }
}
