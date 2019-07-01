package array;

public class MaxArea {
  public static void main(String[] args) {
    int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    System.out.println(new MaxArea().maxArea(new int[]{1, 2, 5, 1}));
//    System.out.println(new MaxArea().maxArea(height));
  }

  public int maxArea(int[] height) {
    int max = Integer.MIN_VALUE;
    for (int i = 0, j = height.length - 1; i < j; ) {
      int value = Math.min(height[i], height[j]) * (j - 1);
      max = Math.max(max, value);
      if (height[i] <= height[j]) {
        i++;
      } else {
        j--;
      }
    }
    return max;
  }
}
