package array;

public class SearchInsert {

  public static void main(String[] args) {
    System.out.println(new SearchInsert().searchInsert(new int[]{1, 3, 5, 6}, 7));
  }

  public int searchInsert(int[] nums, int target) {
    int i = 0;
    int j = nums.length - 1;
    while (i <= j) {
      int m = (i + j) / 2;
      if (nums[m] == target) {
        return m;
      }
      if (target < nums[m]) {
        j = m - 1;
      } else {
        i = m + 1;
      }
    }
    return i;
  }
}
