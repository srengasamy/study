package dynamic;

public class SumRange {
  int[] results;

  public SumRange(int[] nums) {
    results = new int[nums.length + 1];
    for (int i = 1; i < results.length; i++) {
      results[i] = results[i - 1] + nums[i - 1];
    }
  }

  public int sumRange(int i, int j) {
    return results[j + 1] - results[i];
  }

  public static void main(String[] args) {
    SumRange sumRange = new SumRange(new int[]{-2, 0, 3, -5, 2, -1});
    System.out.println(sumRange.sumRange(0, 5));
  }
}
