package array;

import java.util.Arrays;

public class Jump2 {
  public static void main(String[] args) {
    int[] nums = {2, 3, 1, 1, 4};
    System.out.println(new Jump2().jump2(nums));
  }

  public int jump(int[] nums) {
    int[] temp = new int[nums.length];
    Arrays.fill(temp, Integer.MAX_VALUE);
    temp[0] = 0;
    for (int i = 1; i < nums.length; i++) {
      for (int j = i - 1; j >= 0; j--) {
        if (i - j <= nums[j]) {
          temp[i] = Math.min(temp[i], temp[j] + 1);
        }
      }
    }
    return temp[nums.length - 1] == Integer.MAX_VALUE ? -1 : temp[nums.length - 1];
  }

  public int jump2(int[] nums) {
    int end = 0;
    int far = 0;
    int jump = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      far = Math.max(far, i + nums[i]);
      if (i == end) {
        jump++;
        end = far;
      }
    }
    return jump;
  }
}
