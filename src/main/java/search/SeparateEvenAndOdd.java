package search;

public class SeparateEvenAndOdd {
  public static void main(String[] args) {
    int[] nums = {12, 34, 45, 9, 8, 90, 3};
    for (int i = 0, j = nums.length - 1; i < j; ) {
      if (nums[i] % 2 == 0) {
        i++;
        continue;
      }
      if (nums[j] % 2 == 1) {
        j--;
        continue;
      }
      int t = nums[i];
      nums[i] = nums[j];
      nums[j] = t;
      i++;
      j--;
    }
    System.out.println();
  }
}
