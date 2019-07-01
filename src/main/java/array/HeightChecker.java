package array;

import java.util.Arrays;

public class HeightChecker {

  public static void main(String[] args) {
    System.out.println(new HeightChecker().heightChecker(new int[]{1, 1, 4, 2, 1, 3}));
  }

  public int heightChecker(int[] heights) {
    int[] sorted = Arrays.copyOf(heights, heights.length);
    Arrays.sort(sorted);
    int ans = 0;
    for (int i = 0; i < heights.length; i++) {
      if (heights[i] != sorted[i]) {
        ans++;
      }
    }
    return ans;
  }
}
