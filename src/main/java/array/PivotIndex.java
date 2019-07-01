package array;

public class PivotIndex {
  public static void main(String[] args) {
    System.out.println(new PivotIndex().pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
  }

  public int pivotIndex(int[] nums) {
    int[] sum = new int[nums.length];
    sum[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      sum[i] = sum[i - 1] + nums[i];
    }
    for (int i = 0; i < nums.length; i++) {
      if (sum[i] - nums[i] == sum[nums.length - 1] - sum[i]) {
        return i;
      }
    }
    return -1;
  }
}
