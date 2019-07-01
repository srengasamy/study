package tree;

public class BinaryIndexTree {
  public static void main(String[] args) {
    int[] nums = {12, 42, 1, 1, 5, 1, 12, 4};
    int[] sums = new int[nums.length + 1];
    for (int i = 0; i < nums.length; i++) {
      int idx = i + 1;
      while (idx > 0 && idx < sums.length) {
        sums[idx] += nums[i];
        idx += idx & (-idx);
      }
    }
    System.out.println();
  }

}
