package dynamic;

public class Rob {
  public int rob(int[] nums) {
    int[] result = new int[nums.length];
    result[0] = nums[0];
    result[1] = Math.max(nums[0], nums[1]);
    for (int i = 2; i < nums.length; i++) {
      result[i] = Math.max(nums[i] + result[i - 2], result[i - 1]);
    }
    return result[nums.length - 1];
  }

  public static void main(String[] args) {
    System.out.println(new Rob().rob(new int[]{2, 7, 9, 3, 1}));
  }
}
