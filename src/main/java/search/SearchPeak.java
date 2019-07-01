package search;

public class SearchPeak {
  public static void main(String[] args) {
    int[] nums = {1, 4, 8, 16, 24, 25, 48, 47, 46, 45, 40};
    int i = 0;
    int j = nums.length - 1;
    while (i < j) {
      int mid = (i + j) / 2;
      if (nums[mid - 1] < nums[mid] && nums[mid] < nums[mid + 1]) {
        System.out.println(mid);
        break;
      } else if (nums[mid] < nums[mid + 1]) {
        i = mid;
      } else if (nums[mid] > nums[mid + 1]) {
        j = mid;
      }
    }
  }
}
