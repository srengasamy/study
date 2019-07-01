package tree;

import java.util.ArrayList;
import java.util.List;

public class GenerateTrees {
  public List<TreeNode> generateTrees(int n) {
    return null;
  }

  public List<TreeNode> generate(int l, int r) {
    List<TreeNode> results = new ArrayList<>();
    if (l > r) {
      results.add(null);
      return results;
    }
    for (int i = l; i <= r; i++) {
      List<TreeNode> lefts = generate(l, i - 1);
      List<TreeNode> rights = generate(i + 1, r);
      for (TreeNode left : lefts) {
        for (TreeNode right : rights) {
          TreeNode root = new TreeNode(i);
          root.left = left;
          root.right = right;
          results.add(root);
        }
      }
    }
    return results;
  }
}
