package search;

public class FindMaxDifferent {
  public static void main(String[] args) {
    int[] nums = {34, 8, 10, 3, 2, 80, 30, 33, 1};
    int[] mins = new int[nums.length];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < nums[mins[i - 1]]) {
        mins[i] = i;
      } else {
        mins[i] = mins[i - 1];
      }
    }

    for (int i = nums.length - 1; i >= 0; i--) {

    }
  }
}
