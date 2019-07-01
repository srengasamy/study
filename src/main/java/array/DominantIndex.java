package array;

public class DominantIndex {
  public static void main(String[] args) {
    System.out.println(new DominantIndex().dominantIndex(new int[]{1, 2, 3, 4}));
  }

  public int dominantIndex(int[] nums) {
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[max] < nums[i]) {
        max = i;
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (i != max && nums[i] * 2 > nums[max]) {
        return -1;
      }
    }
    return max;
  }
}
