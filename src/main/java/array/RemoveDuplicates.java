package array;

public class RemoveDuplicates {
  public static void main(String[] args) {
    int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int n = new RemoveDuplicates().removeDuplicates(nums);
    for (int i = 0; i < n; i++) {
      System.out.print(nums[i] + " ");
    }
  }

  public int removeDuplicates(int[] nums) {
    int i = 0;
    for (int j = 1; j < nums.length; ) {
      if (nums[i] == nums[j]) {
        j++;
      } else {
        nums[++i] = nums[j];
      }
    }
    return i + 1;
  }
}
