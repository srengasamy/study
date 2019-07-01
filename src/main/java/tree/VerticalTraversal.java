package tree;

import java.util.*;

public class VerticalTraversal {
  public List<List<Integer>> verticalTraversal(TreeNode root) {
    Map<Integer, List<Integer>> map = new HashMap<>();
    visit(root, 0, map);
    List<List<Integer>> results = new ArrayList<>();
    for (int pos : new TreeSet<>(map.keySet())) {
      List<Integer> values = map.get(pos);
      Collections.sort(values);
      results.add(values);
    }
    return results;
  }

  public void visit(TreeNode root, int pos, Map<Integer, List<Integer>> results) {
    if (root == null) {
      return;
    }
    List<Integer> values = results.getOrDefault(pos, new ArrayList<>());
    values.add(root.val);
    results.put(pos, values);
    visit(root.left, pos - 1, results);
    visit(root.right, pos + 1, results);
  }
}
