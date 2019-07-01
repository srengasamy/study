package array;

public class FindMin {
  public static void main(String[] args) {
    int[] nums = {1, 3, 5};
    System.out.println(new FindMin().findMin(nums));
  }

  public int findMin(int[] nums) {
    int i = 0;
    int j = nums.length - 1;
    while (i < j) {
      if (i == j) {
        return nums[i];
      }
      if (i + 1 == j) {
        return Math.min(nums[i], nums[j]);
      }
      int m = (i + j) / 2;
      if (nums[m] > nums[j]) {
        i = m + 1;
      } else if (nums[m] <= nums[j]) {
        j = m;
      }
    }
    return -1;
  }

}
