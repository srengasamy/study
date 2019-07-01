package array;

public class MoveZeroes {
  public static void main(String[] args) {
    int[] nums = {1, 1, 2, 3, 12};
    new MoveZeroes().moveZeroes(nums);
    for (int num : nums) {
      System.out.println(num);
    }
  }

  public void moveZeroes(int[] nums) {
    int i = 0;
    for (int num : nums) {
      if (num != 0) {
        nums[i++] = num;
      }
    }
    while (i < nums.length) {
      nums[i++] = 0;
    }
  }
}
