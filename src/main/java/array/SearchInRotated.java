package array;

public class SearchInRotated {
  public static void main(String[] args) {
    System.out.println(new SearchInRotated().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 10));
  }

  public int search(int[] nums, int target) {
    int result = -1;
    int lo = 0;
    int hi = nums.length - 1;
    while (lo <= hi) {
      if (lo == hi) {
        return nums[lo] == target ? lo : -1;
      }
      int mid = (lo + hi) / 2;
      if (nums[mid] == target) {
        return mid;
      }
      if (nums[lo] < nums[mid]) {
        if (target >= nums[lo] && target < nums[mid]) {
          hi = mid - 1;
        } else {
          lo = mid + 1;
        }
      } else if (nums[mid] < nums[hi]) {
        if (target > nums[mid] && target <= nums[hi]) {
          lo = mid + 1;
        } else {
          hi = mid - 1;
        }
      }
    }
    return result;
  }

}
