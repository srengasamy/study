package array;

public class Rotate {
  public static void main(String[] args) {
    int[] nums = {-1};
    int k = 2;
    new Rotate().rotate(nums, k % nums.length);
    for (int num : nums) {
      System.out.println(num);
    }
  }

  public void rotate(int[] nums, int k) {
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
  }

  public void reverse(int[] nums, int i, int j) {
    while (i < j) {
      int t = nums[i];
      nums[i] = nums[j];
      nums[j] = t;
      i++;
      j--;
    }
  }
}
