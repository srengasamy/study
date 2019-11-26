package array;

public class MinSubArrayLen {

  public int minSubArrayLen(int s, int[] nums) {
    int left = 0, sum = 0, result = nums.length;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if (sum < s) {
        continue;
      }
      while (left <= i && sum >= s) {
        result = Math.min(result, (i - left) + 1);
        sum -= nums[left++];
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(new MinSubArrayLen().minSubArrayLen(4, new int[]{1, 4, 4}));
  }
}
