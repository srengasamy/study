package array;

public class FindUnsortedSubarray {

  public static void main(String[] args) {
    System.out.println(new FindUnsortedSubarray().findUnsortedSubarray(new int[]{1, 2, 3, 3, 3}));
  }

  public int findUnsortedSubarray(int[] nums) {
    int left = Integer.MAX_VALUE;
    int right = Integer.MIN_VALUE;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] >= nums[i - 1]) {
        continue;
      }
      int j = i - 1;
      int t = nums[i];
      while (j >= 0 && nums[j] > t) {
        nums[j + 1] = nums[j];
        j--;
      }
      nums[j + 1] = t;
      left = Math.min(left, j + 1);
      right = Math.max(right, i);
    }
    return left == Integer.MAX_VALUE && right == Integer.MIN_VALUE ? 0 : right - left + 1;
  }
}
