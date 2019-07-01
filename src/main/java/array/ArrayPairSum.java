package array;

import java.util.Arrays;

public class ArrayPairSum {
  public static void main(String[] args) {
    System.out.println(new ArrayPairSum().arrayPairSum(new int[]{10, 9, 3, 4}));
  }

  public int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
    int sum = 0;
    for (int i = 0; i < nums.length; i = i + 2) {
      sum += nums[i];
    }
    return sum;
  }
}
