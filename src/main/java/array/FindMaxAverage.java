package array;

public class FindMaxAverage {

  public static void main(String[] args) {
    System.out.println(new FindMaxAverage().findMaxAverage(new int[]{5}, 1));
  }

  public double findMaxAverage(int[] nums, int k) {
    int sum = 0;
    for (int i = 0; i < k; i++) {
      sum += nums[i];
    }
    double max = sum / (k + 0.0);
    for (int i = k; i < nums.length; i++) {
      sum = sum - nums[i - k] + nums[i];
      max = Math.max(max, sum / (k + 0.0));
    }
    return max;
  }
}
