package dynamic;

public class Rob2 {
  public int rob(int[] nums) {
    int n = nums.length;
    return Math.max(rob(nums, 0, n - 2), rob(nums, 1, n - 1));
  }

  private int rob(int[] num, int lo, int hi) {
    int include = 0, exclude = 0;
    for (int j = lo; j <= hi; j++) {
      int i = include, e = exclude;
      include = e + num[j];
      exclude = Math.max(e, i);
    }
    return Math.max(include, exclude);
  }

  public static void main(String[] args) {
    //int[] nums = {1, 2, 1, 1};
    int[] nums = {2, 1, 1, 2};
    System.out.println(new Rob2().rob(nums));
  }
}
