package search;

public class RotateFind {
  public static void main(String[] args) {
    int nums[] = {15, 16, 19, 20, 25, 26, 1, 2, 3, 4, 5, 7, 10, 14};
    int i = 0;
    int j = nums.length - 1;
    while (i <= j) {
      if (i == j) {
        System.out.println(i);
        break;
      }
      if (i + 1 == j) {
        System.out.println(nums[i] > nums[j] ? j : i);
        break;
      }
      int mid = (i + j) / 2;
      if (nums[mid] > nums[mid + 1] && nums[mid - 1] < nums[mid]) {
        System.out.println(mid);
        break;
      }
      if (nums[i] <= nums[mid] && nums[mid] > nums[j]) {
        i = mid;
      } else {
        j = mid;
      }

    }
  }
}
