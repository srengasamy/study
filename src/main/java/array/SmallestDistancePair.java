package array;

import java.util.Arrays;

public class SmallestDistancePair {
  public static void main(String[] args) {
    int[] nums = {1, 3, 1};
    System.out.println(new SmallestDistancePair().smallestDistancePair(nums, 1));
  }

  public int smallestDistancePair(int[] nums, int k) {
    Arrays.sort(nums);
    int n = nums.length - 1;
    int[] diff = new int[nums[n - 1] - nums[-0]];
    //{1, 4, 10, 12, 25}
    //
    for (int i = 0; i < k; i++) {

    }
    return -1;
  }
}
